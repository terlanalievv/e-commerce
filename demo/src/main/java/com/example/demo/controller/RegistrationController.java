package com.example.demo.controller;

import com.example.demo.domain.PasswordReset;
import com.example.demo.domain.User;
import com.example.demo.domain.UserRole;
import com.example.demo.enums.Status;
import com.example.demo.service.PasswordResetService;
import com.example.demo.service.RoleService;
import com.example.demo.service.UserRoleService;
import com.example.demo.service.UserService;
import com.example.demo.utils.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Optional;

@Controller
@RequestMapping(value = "/register")
public class RegistrationController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRoleService userRoleService;

    @Autowired
    private RoleService roleService;

    @Autowired
    private PasswordResetService passwordResetService;

    @GetMapping(value = "")
    public String RegisterPage(Model model){
        model.addAttribute("page", "register");
        User user = new User();
        model.addAttribute("user", user);
        return "index";
    }

    @PostMapping(value = "/user-register")
    public String registerUser(@ModelAttribute("user") User user, BindingResult result, Model model){

        int seqValue = getUserSeqValue();
        String token = TokenGenerator.createToken();
        String email = user.getEmail();

        user.setUserId(seqValue);
        user.setPassword(PasswordEncoder.encodedPassword(user.getPassword()));
        user.setStatus(Status.DEACTIVE);
        user.setToken(token);
        user.setTokenExpireDate(LocalDateTime.now());
        user.setRegistrationDate(LocalDateTime.now());
        boolean insertResult = userService.saveUser(user);
        if(insertResult){
            UserRole userRole = new UserRole();
            userRole.setUserId(seqValue);
            userRole.setRoleId(getRoleId());
            userRole.setStatus(Status.DEACTIVE);
            boolean userRoleSaveStatus = userRoleService.saveUserRole(userRole);
            if(userRoleSaveStatus){
                MailUtil.sendEmail(email, "http://localhost:8081/register/activate?token=" + token);
            }
        }
        return "redirect:/index";
    }

    @GetMapping("/activate")
    public String updateUserStatus(@RequestParam("token") String token){

        Optional<User> optionalUser = userService.getUserByToken(token);
        if(optionalUser.isPresent()){
            User user = optionalUser.get();
            boolean tokenExpDateResult = DateTimeComparison.compareDateTime(user.getTokenExpireDate());
            if(tokenExpDateResult){
                if(userService.updateUserStatus(user.getUserId())){
                    userRoleService.updateUserRoleStatus((int) user.getUserId(), getRoleId());
                    System.out.println("Update edildi");
                } else{
                    System.out.println("Update edilmedi");
                }
            }

        }
        return "redirect:/index";
    }

    @GetMapping(value = "/forget-password")
    public String forgetPassword(Model model){
        model.addAttribute("page", "forgottenPassword");
        return "index";
    }

    @PostMapping(value = "/check-email")
    public String checkUserEmail(Model model, @RequestParam("email") String email){
        boolean userEmailResult = false;
        if(!email.trim().equals("")) {
            userEmailResult = userService.checkUserEmail(email);
        }
        if (userEmailResult){
            String token = TokenGenerator.createToken();
            passwordResetService.insertPasswordReset(createPasswordResetObject(email, token));
            runSendEmailThread(email, "http://localhost:8081/register/open-reset-password?token=" + token);
            model.addAttribute("checkEmailResult", "emailExist");
        } else {
            model.addAttribute("checkEmailResult", "emailNotExist");
        }
        model.addAttribute("page", "notifications");
        return "index";
    }

    @GetMapping(value = "/open-reset-password")
    public String openResetPassword(Model model, @RequestParam("token") String token){

        Optional<PasswordReset> optionalPasswordReset = passwordResetService.getPasswordResetByToken(token);
        if(optionalPasswordReset.isPresent()) {
            PasswordReset passwordReset = optionalPasswordReset.get();

            if(passwordReset.getStatus().equals(Status.DEACTIVE) && DateTimeComparison.compareDateTime(passwordReset.getTokenExpireDate())){
                model.addAttribute("token", token);
                model.addAttribute("page", "passwordReset");
            } else {
                model.addAttribute("tokenDateExpired", "Error");
                model.addAttribute("page", "notifications");
            }
        }
        return "index";
    }

    @PostMapping(value = "/reset-password")
    public String resetPassword(Model model, @RequestParam("token") String token, @RequestParam("password") String password){

        Optional<PasswordReset> optionalPasswordReset = passwordResetService.getPasswordResetByToken(token);
        if(optionalPasswordReset.isPresent()){
            PasswordReset passwordReset = optionalPasswordReset.get();

            if (passwordReset.getStatus().equals(Status.DEACTIVE) && DateTimeComparison.compareDateTime(passwordReset.getTokenExpireDate())){
                userService.updateUserPassword(passwordReset.getEmail(), PasswordEncoder.encodedPassword(password));
                passwordResetService.updateUserStatus(token);
                model.addAttribute("passwordResetResult", "Success");
            } else {
                model.addAttribute("passwordResetResult", "Error");
            }
        }  else {
            model.addAttribute("passwordResetResult", "Error");
        }

        model.addAttribute("page", "notifications");
        return "index";
    }

    private int getUserSeqValue(){
        return userService.getUserSeqValue();
    }

    private int getRoleId(){
        return roleService.getRoleId();
    }

    private PasswordReset createPasswordResetObject(String email, String token){

        PasswordReset passwordReset = new PasswordReset();
        passwordReset.setEmail(email);
        passwordReset.setToken(token);
        passwordReset.setTokenExpireDate(LocalDateTime.now());
        passwordReset.setStatus(Status.DEACTIVE);
        return passwordReset;
    }

    private void runSendEmailThread(String email, String link){

        SendEmailThread sendEmailThread = new SendEmailThread(email, link);
        Thread thread = new Thread(sendEmailThread);
        thread.start();
    }

    /*@PostMapping("") forget-password
    public String InsertData(
            //@RequestParam(name = "id") long id,
            @RequestParam(name = "name") String name,
            @RequestParam(name="surname") String surname,
            @RequestParam(name="email") String email,
            @RequestParam(name="password") String password){

        //userService.insert(new User(name, surname,email,password));
        return "redirect:/products/product_details";
    }

    @GetMapping(value = "/forgottenPassword")
    public String changeEmail(Model model){
        model.addAttribute("page", "forgottenPassword");
        return "index";
    }*/
}

package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/login")
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "")
    public String loginPage(Model model){
        model.addAttribute("page", "login");
        return "index";
    }

    @GetMapping(value = "/failure")
    public String loginFailure(Model model){
        model.addAttribute("page", "login");
        return "index";
    }

    /*@PostMapping("")
    public String loginPage(
            @RequestParam(name="loginEmail") String email,
            @RequestParam(name="loginPassword") String password){

        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
       // userService.authenticate(user);
        return "redirect:/login-success/";
    }

    @GetMapping(value = "/login-success")
    public String LoginSuccesPage(){
        return "login-success";
    }*/
}

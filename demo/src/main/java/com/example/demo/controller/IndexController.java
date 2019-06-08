package com.example.demo.controller;


import com.example.demo.domain.Elan;
import com.example.demo.domain.User;
import com.example.demo.service.ElanService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpSession;
import java.security.Principal;
import java.util.List;

@Controller
@RequestMapping(value = "/")
public class IndexController {

    @Autowired
    private ElanService elanService;

    @Autowired
    private UserService userService;

    @GetMapping(value = {"/" , "/index"})
    public String index(Model model, Principal principal, HttpSession session){

        if(principal != null){
            User user = userService.getUserByEmail(principal.getName()).get();
            session.setAttribute("user", user);
        }
        model.addAttribute("page", "home");

        List<Elan> elanList = elanService.getAllElans();
        model.addAttribute("elanList", elanList);

        return "index";
    }

    @GetMapping(value = "/myproducts/{userId}")
    public String myProducts(Model model, @PathVariable("userId")int userId){

        List<Elan> elanList = elanService.getMyProducts(userId);
        model.addAttribute("elanList", elanList);
        model.addAttribute("page", "home");
        return "index";
    }

    @GetMapping(value = "/search")
    public String search(Model model, @RequestParam("name") String name){

        List<Elan> elanList = elanService.searchProducts(name);
        System.out.println(elanList.size());
        for (Elan elan:elanList){
            System.out.println(elan.getProductName());
        }
        model.addAttribute("elanList", elanList);
        model.addAttribute("page", "home");
        return "index";
    }



//    @Autowired
//    private RegistrationFormValidator registrationFormValidator;
//
//        @InitBinder
//    protected void initBinder(WebDataBinder dataBinder) {
//        // Form target
//        Object target = dataBinder.getTarget();
//        if (target == null) {
//            return;
//        }
//
//        if (target.getClass() == RegistrationForm.class) {
//            dataBinder.setValidator(registrationFormValidator);
//        }

//        if(target.getClass() == ActivationForm.class){
//            dataBinder.setValidator(activationFormValidator);
//        }
    }

//    @GetMapping("/register")
//    public ModelAndView register() {
//        ModelAndView mav = new ModelAndView("register");
//        RegistrationForm form = new RegistrationForm();
//        mav.addObject("registrationForm", form);
//        return mav;
//    }

//    @PostMapping("/register")
//    public ModelAndView registerCustomer(
//            Model model,
//            @ModelAttribute("registrationForm") @Validated RegistrationForm form,
//            BindingResult validationResult
//    ) {
//
//        ModelAndView mav = new ModelAndView();
//
//        if(validationResult.hasErrors()) {
//            mav.setViewName("register");
//
//            System.out.println("xetalarin sayi = " + validationResult.getErrorCount());
//            System.out.println("xetalar = ");
//            validationResult.getAllErrors().forEach(System.out::println);
//
//        } else {
//            System.out.println("registration form = " + form);
//            // TODO implement registration
//            mav.setViewName("/registration-success");
//        }
//
//        return mav;
//    }



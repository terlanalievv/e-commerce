package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/")
public class IndexController {

    @GetMapping(value = "/")
    public String index(Model model){
        model.addAttribute("page", "home");
        return "index";
    }

    @GetMapping(value = "/index")
    public String backIndexPage(Model model){
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



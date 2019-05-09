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
@RequestMapping(value = "/register")
public class RegistrationController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "")
    public String RegisterPage(Model model){
        model.addAttribute("page", "register");
        return "index";
    }

    @PostMapping("")
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
    }
}

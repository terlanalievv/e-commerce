package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/contact")
public class ContactController {

    @GetMapping(value = "")
    public String ContactPage(Model model){
        model.addAttribute("page", "contact");
        return "index";
    }
}

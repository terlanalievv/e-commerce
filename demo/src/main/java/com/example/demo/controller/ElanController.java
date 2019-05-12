package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/elan")
public class ElanController {

    @GetMapping(value = "")
    public String ElanPage(Model model){
        model.addAttribute("page", "elan");
        return "index";
    }
}

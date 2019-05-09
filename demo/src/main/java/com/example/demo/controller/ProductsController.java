package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/products")
public class ProductsController {

    @GetMapping(value = "")
    public String products(Model model){
        model.addAttribute("page", "product");
        return "index";
    }

    @GetMapping(value = "/product_details")
    public String productDetails(Model model){
        model.addAttribute("page", "product_details");
        return "index";
    }
}

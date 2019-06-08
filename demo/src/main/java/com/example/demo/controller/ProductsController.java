package com.example.demo.controller;

import com.example.demo.domain.Elan;
import com.example.demo.domain.Images;
import com.example.demo.service.ElanService;
import com.example.demo.service.ImagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/products")
public class ProductsController {

    @Autowired
    private ElanService elanService;

    @Autowired
    private ImagesService imagesService;

    @GetMapping(value = "")
    public String products(Model model){
        model.addAttribute("page", "product");
        return "index";
    }

    @GetMapping(value = "/product_details/{elanId}")
    public String productDetails(@PathVariable("elanId") int elanId, Model model){

        if(elanService.getElan(elanId).size() > 0) {
            Elan elan = elanService.getElan(elanId).get(0);
            model.addAttribute("elan", elan);
            model.addAttribute("elanResult", "Found");

            List<Images> images = imagesService.getAllImages(elanId);
            model.addAttribute("images", images);
        } else {
            model.addAttribute("elanResult", "NotFound");
        }

        model.addAttribute("page", "product_details");
        return "index";
    }
}

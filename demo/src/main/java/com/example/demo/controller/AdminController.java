package com.example.demo.controller;

import com.example.demo.domain.Elan;
import com.example.demo.domain.Images;
import com.example.demo.domain.User;
import com.example.demo.service.ElanService;
import com.example.demo.service.ImagesService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.security.Principal;
import java.util.List;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {

    @Autowired
    private ElanService elanService;

    @Autowired
    private UserService userService;

    @Autowired
    private ImagesService imagesService;

    @GetMapping(value = "")
    public String adminPage(Model model, Principal principal, HttpSession session){
        if (principal != null){
            User user = userService.getUserByEmail(principal.getName()).get();
            session.setAttribute("user", user);
        }
        model.addAttribute("pageAdmin", "home");
        return "admin/admin";
    }

    @GetMapping(value = "/elanlar")
    public String elanlarPage(Model model){

        List<Elan> elans = elanService.allElans();
        model.addAttribute("elans", elans);

        model.addAttribute("pageAdmin", "elanlar");
        return "admin/admin";
    }

    @GetMapping(value = "/elan/{id}")
    public String elanDetail(Model model, @PathVariable(value = "id") int id){

        // admin elanin uzerine clock etdikde elanin melumatlari select edilsin ve gosterilsin
        if(elanService.getElanForAdmin(id).size() > 0) {
            Elan elan = elanService.getElanForAdmin(id).get(0);
            model.addAttribute("elan", elan);
            model.addAttribute("elanResult", "Found");

            List<Images> images = imagesService.getAllImages(id);
            model.addAttribute("images", images);
        } else {
            model.addAttribute("elanResult", "NotFound");
        }

        model.addAttribute("pageAdmin", "elanDetail");
        return "admin/admin";
    }

    @GetMapping(value = "/elan/updateAnnStatus/{id}/{status}")
    public String updateElanAnnouncementStatus(@PathVariable(value = "id") int id, @PathVariable(value = "status") int status){
        elanService.updateElanAnnouncementStatus(id, status);
        return "redirect:/admin/elan/" + id;
    }

    @GetMapping(value = "/elan/updateStatus/{id}/{status}")
    public String updateElanStatus(@PathVariable(value = "id") int id, @PathVariable(value = "status") int status){
        elanService.updateElanStatus(id, status);
        return "redirect:/admin/elan/" + id;
    }

    @GetMapping(value = "/statistics")
    public String statisticsPage(Model model){
        model.addAttribute("pageAdmin", "statistics");
        return "admin/admin";
    }

    @GetMapping(value = "/users")
    public String usersPage(Model model){

        List<User> userList = userService.allUsers();
        model.addAttribute("users",userList);

        model.addAttribute("pageAdmin", "users");
        return "admin/admin";
    }

    @GetMapping(value = "/user/{id}")
    public String userDetail(Model model, @PathVariable(value = "id") int id){

        model.addAttribute("pageAdmin", "userDetail");
        return "admin/admin";
    }
}

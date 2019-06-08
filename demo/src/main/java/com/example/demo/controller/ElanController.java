package com.example.demo.controller;

import com.example.demo.domain.*;
import com.example.demo.enums.AnnouncementStatus;
import com.example.demo.enums.Currency;
import com.example.demo.enums.Status;
import com.example.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.Principal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(value = "/elan")
public class ElanController {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private CityService cityService;

    @Autowired
    private ElanService elanService;

    @Autowired
    private ImagesService imagesService;

    @Autowired
    private UserService userService;

    @GetMapping(value = "")
    public String ElanPage(Model model, Principal principal, HttpSession session){

        if(principal != null){
            User user = userService.getUserByEmail(principal.getName()).get();
            session.setAttribute("user", user);
        }

        List<Category> categories = categoryService.getCategories();
        model.addAttribute("categories", categories);

        List<City> cities = cityService.getCities();
        model.addAttribute("cities", cities);

        Elan elan = new Elan();
        model.addAttribute("elan", elan);

        model.addAttribute("page", "elan");
        return "index";
    }

    @PostMapping(value = "/save")
    public String saveAnnouncement(@ModelAttribute("elan") Elan elan, BindingResult result, Model model, HttpSession session){

        User user = (User) session.getAttribute("user");

        int elanId = elanService.getElanSeqValue();
        Category category = new Category(Integer.valueOf(elan.getCategoryId()));
        Currency currency = null;
        City city = new City(Integer.valueOf(elan.getCityId()));
        LocalDateTime localDateTime = LocalDateTime.now();

        if(elan.getCurrencyLabel().equals("AZN")){
            currency = Currency.AZN;
        } else if(elan.getCurrencyLabel().equals("EUR")){
            currency = Currency.EUR;
        } else if(elan.getCurrencyLabel().equals("USD")){
            currency = Currency.USD;
        }

        elan.setId(elanId);
        elan.setCategory(category);
        elan.setCurrency(currency);
        elan.setCity(city);
        elan.setStatus(Status.DEACTIVE);
        elan.setAnnouncementStatus(AnnouncementStatus.PENDING);
        elan.setExpireDate(localDateTime.plusDays(30));
        elan.setAddedDate(localDateTime);
        elan.setUser(user);

        if(elanService.saveElan(elan)){
            model.addAttribute("elanSaveResult", "Success");
        } else{
            model.addAttribute("elanSaveResult", "Error");
        }

        List<MultipartFile> files = elan.getFiles();
        for (MultipartFile file: files){
            String fileName = file.getOriginalFilename();
            Images images = new Images();
            images.setName(fileName);
            images.setElan(new Elan(elanId));
            imagesService.saveImages(images);

            try {
                Path path = Paths.get("src/main/webapp/resources/images/" + fileName);
                File imageFile = new File(path.toString());
                imageFile.createNewFile();
                OutputStream outputStream = new FileOutputStream(imageFile);
                outputStream.write(file.getBytes());
                outputStream.flush();
                outputStream.close();
            } catch (Exception e){
                e.printStackTrace();
            }
        }

        model.addAttribute("page", "notifications");
        return "index";
    }
}

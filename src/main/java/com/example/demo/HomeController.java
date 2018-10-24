package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String homePage(){
        return "login";
    }

    @RequestMapping("/processform")
    public String homeFormPage(){

        return "welcome";
    }

}

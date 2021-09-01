package com.saiqb.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/home")
    public String homePage(){
        return "HomePage.html";
    }
}

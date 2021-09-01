package com.saiqb.springmvc.controller;

import com.saiqb.springmvc.model.Programmer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@ControllerAdvice
public class MainController {

    @ModelAttribute
    public void welcome(Model m){
        m.addAttribute("msg", "Welcome to Spring Boot Tutorial");
    }

    @GetMapping("/home")
    public String homePage(){
        return "HomePage.html";
    }

    @PostMapping("/addProgrammer")
    public String addProgrammer(@ModelAttribute Programmer programmer){

        return "ProgrammerInfo.html";
    }
}

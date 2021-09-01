package com.saiqb.springmvc.controller;

import com.saiqb.springmvc.model.Programmer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@ControllerAdvice
public class MainController {

    @ModelAttribute
    public void welcome(Model m){
        m.addAttribute("msg", "Welcome to Spring Boot Tutorial");
    }

    @RequestMapping("/home")
    public String homePage(){
        return "HomePage.html";
    }

    @RequestMapping("/addProgrammer")
    public String addProgrammer(@ModelAttribute("p") Programmer programmer){

        return "ProgrammerInfo.html";
    }
}

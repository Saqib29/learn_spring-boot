package com.saiqb.springmvc.controller;

import com.saiqb.springmvc.model.Programmer;
import com.saiqb.springmvc.repository.ProgrammerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@ControllerAdvice
public class MainController {

    @Autowired
    ProgrammerRepo pr;

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
        pr.save(programmer);
        return "ProgrammerInfo.html";
    }

    @GetMapping("/allProgrammer")
    public String allProgrammer(Model m){
        List<Programmer> p = new ArrayList<Programmer>();
        p.add(new Programmer(101, "Zabir Rahman", "Java"));
        p.add(new Programmer(102, "Saqib Aminul", "Python"));
        p.add(new Programmer(103, "Aminul Islam Saqib", "JavaScript"));

        m.addAttribute("programmers", p);
        return "AllProgrammer.html";
    }
}

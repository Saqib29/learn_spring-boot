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

    @GetMapping("/home")
    public String homePage(){
        return "HomePage.html";
    }

    @PostMapping("/addProgrammer")
    public String addProgrammer(@ModelAttribute Programmer programmer){
        pr.save(programmer);
        return "redirect:/home";
    }

    @PostMapping("/findById")
    public String findById(@RequestParam int pId, Model m){
        Programmer p = pr.getOne(pId);
        m.addAttribute("programmer",p);

        return "ProgrammerInfo.html";
    }

    @GetMapping("/deleteprogrammer")
    public String deleteprogrammer(@RequestParam int pId){
        pr.deleteById(pId);
        return "redirect:/home";
    }

    @PostMapping("/updateProgrammer")
    public String updateProgrammer(@ModelAttribute Programmer programmer){
        Programmer p = pr.getById(programmer.getpId());
        p.setpName(programmer.getpName());
        p.setpLang(programmer.getpLang());

        pr.save(p);

        return "ProgrammerInfo.html";
    }

    @PostMapping("/findByLang")
    public String findByLang(@RequestParam String pLang, Model m){
        List<Programmer> p = pr.findBypLang(pLang);

        m.addAttribute("programmers", p);
        return "AllProgrammer.html";
    }
}

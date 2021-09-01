package com.saiqb.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @RequestMapping("/home")
    public String homePage(){
        return "HomePage.html";
    }

    @RequestMapping("/addProgrammer")
    public String addProgrammer(@RequestParam int pId,
                                @RequestParam String pName,
                                @RequestParam String pLang,
                                Model model){

        model.addAttribute("pName", pName);
        model.addAttribute("pId", pId);
        model.addAttribute("pLang", pLang);

        return "ProgrammerInfo.html";
    }
}

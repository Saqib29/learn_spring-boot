package com.saiqb.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @RequestMapping("/home")
    public String homePage(){
        return "HomePage.html";
    }

    @RequestMapping("/addProgrammer")
    public ModelAndView addProgrammer(@RequestParam("pId") int Id,
                                      @RequestParam("pName") String name,
                                      @RequestParam String pLang){


        ModelAndView mv = new ModelAndView();
        
        mv.setViewName("ProgrammerInfo.html");
        mv.addObject("pName", name);
        mv.addObject("pId", Id);
        mv.addObject("pLang", pLang);


        return mv;
    }
}

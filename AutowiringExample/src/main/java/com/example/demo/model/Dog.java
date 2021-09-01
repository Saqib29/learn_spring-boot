package com.example.demo.model;

import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

@Component
public class Dog {

    public Dog(){
        System.out.println("Dog object created");
    }

    public void info(){
        System.out.println("This is a german shaperd Dog");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Dog object destroyed");
    }
}

package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

@Component
public class Coder {

    @Autowired
    Dog dog;

    public Coder(){
        System.out.println("Coder object created");
    }

    public void petInfo(){
        dog.info();
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Coder object destrpyed");
    }
}

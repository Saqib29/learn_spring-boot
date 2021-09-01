package com.saqib.main.model;

import javax.annotation.PreDestroy;

public class Computer {

    private String brand;

    public Computer() {
        System.out.println("No - arg constructor call (Computer class)");
    }

    public Computer(String brand) {
        this.brand = brand;
        System.out.println("All - arg constructor call (Computer class)");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Computer object destroy");
    }
}

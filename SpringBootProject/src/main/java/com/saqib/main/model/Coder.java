package com.saqib.main.model;

import javax.annotation.PreDestroy;

public class Coder {

    private int id;
    private String name;
    private String language;
    private Computer computer;

    public Coder() {
        System.out.println("No - arg constructor call (Coder class)");
    }

    public Coder(int id, String name, String language, Computer computer) {
        this.id = id;
        this.name = name;
        this.language = language;
        this.computer = computer;
        System.out.println("All - arg constructor call (Coder class)");
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Coder object destroyed");
    }
}

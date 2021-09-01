package com.saqib.main.config;

import com.saqib.main.model.Coder;
import com.saqib.main.model.Computer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public Coder coder1(@Qualifier("computer1") Computer computer){
        Coder c1 = new Coder();
        c1.setId(1001);
        c1.setName("Md Adam");
        c1.setLanguage("Java");
        c1.setComputer(computer);

        return c1;
    }

    @Bean
    public Computer computer1(){
        Computer com1 = new Computer();
        com1.setBrand("AMD");
        return com1;
    }

    @Bean
    public Coder coder2(@Qualifier("computer2") Computer computer){
        Coder c1 = new Coder();
        c1.setId(1001);
        c1.setName("Mr Eve");
        c1.setLanguage("JavaScript");
        c1.setComputer(computer);

        return c1;
    }

    @Bean
    public Computer computer2(){
        Computer com1 = new Computer();
        com1.setBrand("Intel");
        return com1;
    }
}

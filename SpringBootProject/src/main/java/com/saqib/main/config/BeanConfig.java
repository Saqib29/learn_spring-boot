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
        Coder c1 = new Coder(1001, "MD Adam", "Java", computer);
        c1.setId(1001);

        return c1;
    }

    @Bean
    public Computer computer1(){
        Computer com1 = new Computer("AMD");

        return com1;
    }

    @Bean
    public Coder coder2(@Qualifier("computer2") Computer computer){
        Coder c1 = new Coder(1002, "Mr Eve", "JavaScript", computer);

        return c1;
    }

    @Bean
    public Computer computer2(){
        Computer com1 = new Computer("Intel");

        return com1;
    }
}

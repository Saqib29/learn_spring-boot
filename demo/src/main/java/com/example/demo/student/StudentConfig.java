package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student saqib = new Student(
                    "Saqib",
                    "saqib29111@gmail.com",
                    LocalDate.of(1995, Month.NOVEMBER, 29)
            );

            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(1995, Month.JANUARY, 29)
            );

            repository.saveAll(
                    List.of(saqib, alex)
            );
        };
    }
}

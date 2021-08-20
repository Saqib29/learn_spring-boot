package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {
    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Saqib",
                        "saqib29111@gmail.com",
                        LocalDate.of(1995, Month.NOVEMBER, 29),
                        29
                )
        );
    }
}

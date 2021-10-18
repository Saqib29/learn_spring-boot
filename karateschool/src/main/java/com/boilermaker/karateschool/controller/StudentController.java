package com.boilermaker.karateschool.controller;

import com.boilermaker.karateschool.controller.exception.ResourceNotFoundException;
import com.boilermaker.karateschool.model.Student;
import com.boilermaker.karateschool.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/api/auth")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @CrossOrigin
    @PostMapping("/student")
    public Student createStudent(@Valid @RequestBody Student student){
        Student student_save = studentRepository.save(student);
        return student_save;
    }

    @CrossOrigin
    @GetMapping("/student")
    public Page<Student> listStudent(Pageable pageable){
        return studentRepository.findAll(pageable);
    }

    @CrossOrigin
    @GetMapping("/student/{id}")
    public Student getById(@PathVariable Long id){
        Student student = studentRepository.getById(id);
        return student;
    }

    @CrossOrigin
    @DeleteMapping("/student/{id}")
    public ResponseEntity<?> deleteStudent(@PathVariable Long id){
        return studentRepository.findById(id)
                .map(student -> {
                    studentRepository.delete(student);
                    return ResponseEntity.ok().build();
                }).orElseThrow(() -> new ResourceNotFoundException("Student not found with id " + id ));
    }
}

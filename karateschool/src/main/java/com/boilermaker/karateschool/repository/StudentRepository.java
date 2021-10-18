package com.boilermaker.karateschool.repository;

import com.boilermaker.karateschool.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}

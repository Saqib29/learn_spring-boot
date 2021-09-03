package com.saiqb.springmvc.repository;

import com.saiqb.springmvc.model.Programmer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgrammerRepo extends JpaRepository<Programmer, Integer> {
}

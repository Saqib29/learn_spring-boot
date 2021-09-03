package com.saiqb.springmvc.repository;

import com.saiqb.springmvc.model.Programmer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProgrammerRepo extends JpaRepository<Programmer, Integer> {
    List<Programmer> findBypLang(String pLang);

    @Query("from Programmer where pName = ?1")
    List<Programmer> findProgrammer(String pName);

    @Query(value = "select * from Programmer where programmer_name = ?1 and p_lang = ?2", nativeQuery = true)
    List<Programmer> findNL(String pName, String pLang);
}

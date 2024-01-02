package com.example.odev.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.odev.model.Student; 
public interface StudentRepository 
    extends JpaRepository<Student, Long> { 
}

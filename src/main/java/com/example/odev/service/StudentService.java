package com.example.odev.service;

import java.util.List;


import com.example.odev.model.Student;

public interface StudentService {
	List<Student> getAllStudents(); 
	  
    Student getStudentById(Long id); 
  
    void saveStudent(Student student); 
  
    void deleteStudent(Long id);
}

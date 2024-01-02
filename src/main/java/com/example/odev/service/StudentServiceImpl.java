package com.example.odev.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.odev.model.Student;
import com.example.odev.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	 @Autowired 
	 private StudentRepository studentRepository; 
	  
	    @Override 
	    public List<Student> getAllStudents() 
	    { 
	        return studentRepository.findAll(); 
	    } 
	  
	    @Override 
	    public Student getStudentById(Long id) 
	    { 
	        return studentRepository.findById(id).orElse(null); 
	    } 
	  
	    @Override 
	    public void saveStudent(Student student) 
	    { 
	        studentRepository.save(student); 
	    } 
	  
	    @Override 
	    public void deleteStudent(Long id) 
	    { 
	        studentRepository.deleteById(id); 
	    } 
}

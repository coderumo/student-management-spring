package com.example.odev.model; 
  
import jakarta.persistence.Entity; 

import jakarta.persistence.GeneratedValue; 
import jakarta.persistence.GenerationType; 
import jakarta.persistence.Id; 
  
@Entity
public class Student { 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id; 
    private String name; 
    private int age; 
    private String enrolledcourse; 
    private String deneme;
    
    public Student() {} 
    public Student(Long id,String name,int age,String enrolledcourse, String deneme) 
    { 
        super(); 
        this.id = id; 
        this.name = name; 
        this.age = age; 
        this.enrolledcourse = enrolledcourse; 
        this.deneme = deneme;
    } 
    public String getDeneme() {
		return deneme;
	}
	public void setDeneme(String deneme) {
		this.deneme = deneme;
	}
	public Long getId() { 
      return id;  
    } 
    public void setId(Long id) { 
      this.id = id;  
    } 
    public String getName() { 
      return name;  
    } 
    public void setName(String name) { 
      this.name = name;  
    } 
    public int getAge() { 
      return age;  
    } 
    public void setAge(int age) { 
      this.age = age;  
    } 
    public String getEnrolledcourse() 
    { 
        return enrolledcourse; 
    } 
    public void setEnrolledcourse(String enrolledcourse) 
    { 
        this.enrolledcourse = enrolledcourse; 
    } 
}

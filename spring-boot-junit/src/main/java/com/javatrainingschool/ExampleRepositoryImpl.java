package com.javatrainingschool;

import org.springframework.stereotype.Repository;

@Repository
public class ExampleRepositoryImpl {
	
    public String get() {
        return "Hello JUnit 5";
    }
    
    public String getData() {
        return "Hello getData method from ExampleRepositoryIMPL";
    }
    
    public String getById(Integer id) {
    	
    	String message = "The id is : " + id;
    	return message;
    }

}

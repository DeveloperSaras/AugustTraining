package com.javatrainingschool;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//this is a test class
@SpringBootTest
public class ExampleServiceTest {

    @Autowired
    ExampleServiceImpl exampleService;

    //This change is by another developer
    @DisplayName("Test Spring @Autowired Integration")
    @Test
    void testGet() {
        assertEquals("Hello JUnit 5", exampleService.get());
    }
    
}

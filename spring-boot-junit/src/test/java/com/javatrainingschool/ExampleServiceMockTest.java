package com.javatrainingschool;

import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ExampleServiceMockTest {

	    @Mock
	    private ExampleRepositoryImpl exampleRepo;

	    @InjectMocks // auto inject helloRepository
	    private ExampleServiceImpl exampleService = new ExampleServiceImpl();

	    @BeforeEach
	    void setMockOutput() {
	        when(exampleRepo.get()).thenReturn("Hello Mockito From Repository");
	        when(exampleRepo.getById(any(Integer.class))).thenReturn("The id is dummy value");
	    }

	    @DisplayName("Test Mock helloService + helloRepository")
	    @Test
	    void testGet() {
	    	assertThrows(RuntimeException.class, () -> System.out.println("Exception caught"));
	        //assertEquals("Hello Mockito From Repository", helloService.get());
	    }
	    
	    //positive scenario. When exception doesn't occur
	    @Test
	    void testGetById() {
	    	
	    	int id = 10;
	    	
	    	String result = exampleService.getById(id);
	    	
	        assertEquals("The id is dummy value", result);
	    }
	    
	    @Test
	    //exception scenario
	    void testGetById_Exception() {
	    	
	        assertThrows(RuntimeException.class, () -> exampleService.getById(420));
	    }

	}


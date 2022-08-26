package com.javatrainingschool;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExampleServiceImpl {

	@Autowired
	ExampleRepositoryImpl exampleRepository;

	public String get() {
		return exampleRepository.get();
	}

	public String getById(int id) {

		if (id == 420) {
			throw new RuntimeException("Illegal id");
		}

		return exampleRepository.getById(id);
	}

}

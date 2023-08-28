package com.example.pedrosa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PedrosaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PedrosaApplication.class, args);
	}

	@GetMapping("/")
	public String oi(){
		return "Matheus Poderosa";
	}
}

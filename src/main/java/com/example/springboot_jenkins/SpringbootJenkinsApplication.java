package com.example.springboot_jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootJenkinsApplication{

	@GetMapping("/message")
	public String getMessage(){
		return "Hello jenkins";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJenkinsApplication.class, args);
	}

}

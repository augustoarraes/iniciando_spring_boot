package com.projeto.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class IniciandoapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(IniciandoapiApplication.class, args);
	}
	
	@GetMapping("/hello")
	public String hello( @RequestParam(value="name", defaultValue="Meu nome") String name ) {
		return String.format("Opa, %s!", name);
	}

}

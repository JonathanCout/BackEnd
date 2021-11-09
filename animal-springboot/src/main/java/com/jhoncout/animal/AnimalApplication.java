package com.jhoncout.animal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AnimalApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnimalApplication.class, args);
	}

	@GetMapping
	public String hello(){
		return "EU NAO AGUENTO MAIS FILHA DA PUTAAAAAAAAAAAAAAAAAAAAAAAAA!";
	}

	@GetMapping("/consulta")
	public String xablau(){
		return "X A B L A U!";
	}


}

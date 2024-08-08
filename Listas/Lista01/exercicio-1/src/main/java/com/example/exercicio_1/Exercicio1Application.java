package com.example.exercicio_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

@RequestMapping("/app")
public class Exercicio1Application {
	
	@RequestMapping("/senha/{senha}")
	public String senhaAutorizada(@PathVariable String senha) {
		if ("senha123".equals(senha)) {
			return "Entrada autorizada";
		} else {
			return "Entrada não autorizada";
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(Exercicio1Application.class, args);
	}

}

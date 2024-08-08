package com.example.exercicio_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

@RequestMapping("/app")
public class Exercicio2Application {

	@RequestMapping("km/{km}")
	public String km(@PathVariable double km){
		double pratas = 25*km;

		return String.format("O preco final da sua expedicao eh: %s pratas", pratas);
	}

	public static void main(String[] args) {
		SpringApplication.run(Exercicio2Application.class, args);
	}

}
package com.example.exercicio_1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/app")
public class Exercicio1Application {
	private static List<IlhaDeCalor> ilhas = new ArrayList<>();

	@GetMapping("/ilhas-de-calor")
	public List<IlhaDeCalor> listarIlhasDeCalor(){
		return ilhas;
	}

	@PostMapping
	public static String adicionarIlhaDeCalor(@RequestBody IlhaDeCalor ilha){
		ilhas.add(ilha);
		return "Nova ilha de calor " + ilha.getBairro() + " adicionada com sucesso";
	}

	public static void main(String[] args) {
		SpringApplication.run(Exercicio1Application.class, args);
	}

}

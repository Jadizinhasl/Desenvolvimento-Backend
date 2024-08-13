package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/app")
public class DemoApplication {

	@GetMapping("/ola/{nome}")
	public static String olaMundo(@PathVariable("nome") String nome){
		return "Ola, " + nome;
	}

	@PostMapping("/valida-idade")
	public String validaIdadeUsuario(@RequestBody Usuario usuario){
		if (usuario.getIdade() >= 18) {
			return "Você pode acessar o sistema";
		} 
		return "Não pode acessar";
	}


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

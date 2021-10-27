package com.helloworld.Hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloController {
	@GetMapping ("/hello")
	public String hello() {
		return "HelloWorld";
	}
	
	@GetMapping ("/atividade1")
	public String hello2() {
		return "Habilidade: Persistência. \nMentalidade: Atenção aos detalhes.";
	}
	@GetMapping ("/atividade2")
	public String hello3() {
		return "Objetivo de aprendizagem: Aprender a utilizar o Spring Boot.";
	}

}

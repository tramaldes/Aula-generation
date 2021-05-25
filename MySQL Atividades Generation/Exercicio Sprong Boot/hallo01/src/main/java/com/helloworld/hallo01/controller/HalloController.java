package com.helloworld.hallo01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hallo") 
 public class HalloController {
	
	@GetMapping
	public String hello() {
		return "Neste exercício desenvolvi a Persistência!";
	}
	@GetMapping("/rota 2")
	public String hallo() {
		return "Nessa semana aprendimuito sobre proaticidade, tomar iniciativa, correr atrás!!!";
	}
	
}

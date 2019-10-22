package com.ejemplo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


public class Adriancontroller {
	
     @RestController 
	@RequestMapping("/adrian")
	@GetMapping
		public String prueba() {
			return "Hola ";
		}
}

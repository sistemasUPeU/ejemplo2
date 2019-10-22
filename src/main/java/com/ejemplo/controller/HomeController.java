package com.ejemplo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prueba")
public class HomeController {

	
	@GetMapping
	public String get() {
		return "esto es una prueba";
	}
	
	@GetMapping("/gabriel")
	public String gabriel() {
		return "gabriel cosi";
	}
}

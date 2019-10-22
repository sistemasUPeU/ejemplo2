package com.ejemplo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/castillo")
public class CastilloController {
	@GetMapping
	public String get() {
		return "Hola mundo by:Ruben Castillo";
	}
	

}
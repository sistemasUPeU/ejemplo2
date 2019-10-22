package com.ejemplo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daniel")
public class DanielController {
	@GetMapping
	public String get() {
		return "esta es una pausa activa";
	}
	

}

package com.ejemplo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/johan")
public class JohanController {

	@GetMapping
	public String get() {
		return "Hola soy johan";
	}
}

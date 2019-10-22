package com.ejemplo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gabriel")
public class GabrielController {

	@GetMapping
	public String get() {
		return "gabriel cosi";
	}
}

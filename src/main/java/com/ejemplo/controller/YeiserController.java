package com.ejemplo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/yeiser")
public class YeiserController {
	
	@GetMapping
	public String get() {
		return "HOLA SOY YEISER";
	}
}

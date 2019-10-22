package com.ejemplo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/madai")
public class MadaiController {
	@GetMapping
	public String saludo() {
		return "Hello there. BY: Madai";
	}
}
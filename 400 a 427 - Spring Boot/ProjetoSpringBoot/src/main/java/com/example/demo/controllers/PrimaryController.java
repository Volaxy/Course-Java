package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimaryController {

	@GetMapping(path = {"/hello", "/h"})
	public String hello() {
		return "Hello!";
	}
	
}

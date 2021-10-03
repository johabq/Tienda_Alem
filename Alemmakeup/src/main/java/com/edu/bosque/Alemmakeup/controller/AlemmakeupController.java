package com.edu.bosque.Alemmakeup.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("index")
public class AlemmakeupController {
		
	@GetMapping
	public String Index() {
		return "home";
	}
	/*
	@GetMapping
	public String home() {
		return "home";
	}
	*/
	@PostMapping
	public String homeAcess() {
		return "home";
	}
}

package com.edu.bosque.Alemmakeup.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AlemmakeupController {
		
	@GetMapping("/")
	public String Index() {
		return "Index";
	}
}

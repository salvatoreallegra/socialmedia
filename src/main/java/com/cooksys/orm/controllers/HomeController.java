package com.cooksys.orm.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class HomeController {
	
	@GetMapping
	public String Home() {
		return "<h1>Social Media Api</h1>";
	}

}

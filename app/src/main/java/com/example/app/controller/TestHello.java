package com.example.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestHelloController {

	@GetMapping ("/test/hello/hellowolrd")
	public String TestHelloWorld () {
		String str = "Hello World";
		return str;
	}
}

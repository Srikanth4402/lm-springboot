package com.loyalty.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class MyController 
{
	@GetMapping("/req1")
	public String getMsg() 
	{
		return "welcome Sathvik Hero";
	}
	@GetMapping("/req2")
	public String getMsg1() {
		return "Hello";
	}
}

package com.moh.gov.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
	
	@GetMapping("/getName")
	public void getName() {
		System.out.println("Hi Fakhrudeen Ali Ahamed");
	}

}

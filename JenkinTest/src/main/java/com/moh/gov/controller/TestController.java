package com.moh.gov.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
	
	@GetMapping("/getName")
	public ResponseEntity<String>  getName() {
		String message="<h1>Welcome to Spring Boot</h1>";
		return new ResponseEntity<String>(message,HttpStatus.OK);
		
	}
	
	
	@GetMapping("/getMyName")
	public ResponseEntity<String>  getMyName() {
		String message="<h1>Hi Welcome Fakhrudeen Ali Ahamed</h1>";
		return new ResponseEntity<String>(message,HttpStatus.OK);
		
	}
	
	
	
	

}

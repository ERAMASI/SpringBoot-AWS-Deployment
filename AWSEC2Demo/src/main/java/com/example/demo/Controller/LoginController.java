package com.example.demo.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	
	@GetMapping("/aws")
	public ResponseEntity<String> getName()
	{
		return ResponseEntity.ok("Successfully Deployed Spring Boot Application in AWS using EC2 instance ");
	}

}

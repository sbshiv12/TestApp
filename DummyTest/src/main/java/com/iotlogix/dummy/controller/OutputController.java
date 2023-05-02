package com.iotlogix.dummy.controller;

import java.time.ZonedDateTime;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class OutputController {
	
	@GetMapping("/orders")
	public ResponseEntity<String> getAllOrders() {
		return ResponseEntity.ok().body("Rest call is a success. "+ZonedDateTime.now());
	}
	

	
}

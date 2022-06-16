package com.airline.qantas.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/v1")
public class FlightController {

	@GetMapping("/flights")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Object> getFlights(){	
		
		return new ResponseEntity<>("response", HttpStatus.OK);
	}
}

/**
* The FlightController contains API end-points to fetch flight information
*
* @author  Sunil Mehettar
* @version 1.0
* @since   2022-06-16 
*/
package com.airline.qantas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.airline.qantas.dto.ResponseDto;
import com.airline.qantas.exception.NoDataException;
import com.airline.qantas.service.FlightService;


@RestController
@RequestMapping("/v1")
public class FlightController {

	@Autowired 
	FlightService flightService;
	
	@GetMapping("/flights")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Object> getFlights(@RequestParam(value = "search", defaultValue = "ALL") String filter) throws NoDataException {	
		
		ResponseDto response = flightService.getAllTodaysFlights(filter);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}

package com.airline.qantas.dto;

import java.util.List;

public class ResponseDto {
	
	private List<FlightDetailsDto> flights;

	public List<FlightDetailsDto> getFlights() {
		return flights;
	}

	public void setFlights(List<FlightDetailsDto> flights) {
		this.flights = flights;
	}

}

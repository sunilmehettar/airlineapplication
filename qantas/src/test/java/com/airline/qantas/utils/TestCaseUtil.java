package com.airline.qantas.utils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.airline.qantas.dto.FlightDetailsDto;
import com.airline.qantas.dto.ResponseDto;
import com.airline.qantas.model.AirlineModel;
import com.airline.qantas.model.FlightScheduleModel;
import com.airline.qantas.model.LocationModel;
import com.airline.qantas.util.DateUtil;

public class TestCaseUtil {

	public static ResponseDto getFlightsrResponseDto() {

		ResponseDto dto=new ResponseDto();
		
		List<FlightDetailsDto> detailList=new ArrayList<>();
		FlightDetailsDto flight=new FlightDetailsDto();
		flight.setFlightNumber("GL101");
		flight.setDeparturePort("IND");
		flight.setArrivalPort("AUS");
		flight.setDepartureTime("2022-06-16T16:24:03Z");
		flight.setArrivalTime("2022-06-17T02:00:03Z");
		detailList.add(flight);
		dto.setFlights(detailList);
		return dto;
	}
	
	public static List<FlightScheduleModel> getFlightModelList() {

		Date today = new Date();
		List<FlightScheduleModel> modelList=new ArrayList<>();
		 
		AirlineModel airLineModel=new AirlineModel();
		airLineModel.setId(UUID.fromString("33069a7b-af3e-4344-81bf-64fbff384810"));
		airLineModel.setCode("EK");
		airLineModel.setName("Emirates");
		
		LocationModel departurePort =new LocationModel();
		departurePort.setId(UUID.fromString("07b1514a-dc46-4d46-a10f-1f572f2a01b6"));
		departurePort.setCode("SYD");
		departurePort.setName("Sydney");
		
		LocationModel arrivalPort =new LocationModel();
		arrivalPort.setId(UUID.fromString("d00396be-fa0f-4958-8aed-b0b30f043e2d"));
		arrivalPort.setCode("MEL");
		arrivalPort.setName("Melbourne");
		
		FlightScheduleModel flightModel=new FlightScheduleModel();
		flightModel.setId(UUID.fromString("5bbca219-38f3-4f24-b796-6c2292e8120b"));
		flightModel.setAirlineModel(airLineModel);
		flightModel.setDeparturePort(departurePort);
		flightModel.setArrivalPort(arrivalPort);
		flightModel.setDepartureTime(DateUtil.atStartOfDay(today));
		flightModel.setArrivalTime(DateUtil.atEndOfDay(today));
		
		modelList.add(flightModel);
		return modelList;
	}
	
	
}


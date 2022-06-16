package com.airline.qantas.translator;

import java.util.ArrayList;
import java.util.List;

import com.airline.qantas.dto.FlightDetailsDto;
import com.airline.qantas.dto.ResponseDto;
import com.airline.qantas.model.FlightScheduleModel;
import com.airline.qantas.util.DateUtil;

public class FlightTranslator {

	public ResponseDto modelToResponseDto(List<FlightScheduleModel> list) {

		ResponseDto dto=new ResponseDto();
		List<FlightDetailsDto> detailList=new ArrayList<>();
		
		list.forEach(record->{
			FlightDetailsDto flight=new FlightDetailsDto();
			flight.setFlightNumber(record.getAirlineModel().getCode()+record.getFlightCode());
			flight.setDeparturePort(record.getDeparturePort().getCode());
			flight.setArrivalPort(record.getArrivalPort().getCode());
			flight.setDepartureTime(DateUtil.toISO8601UTC(record.getDepartureTime()));
			flight.setArrivalTime(DateUtil.toISO8601UTC(record.getArrivalTime()));
			detailList.add(flight);
		});
		dto.setFlights(detailList);
		return dto;
	}

}

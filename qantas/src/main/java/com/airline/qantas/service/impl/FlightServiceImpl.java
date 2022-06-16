/**
 * The FlightServiceImpl class contains the definition of
 *  service methods on flight data
 *  
* @author  Sunil Mehettar
* @version 1.0
* @since   2022-06-16  
 */

package com.airline.qantas.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airline.qantas.dao.FlightDao;
import com.airline.qantas.dto.ResponseDto;
import com.airline.qantas.exception.NoDataException;
import com.airline.qantas.model.FlightScheduleModel;
import com.airline.qantas.service.FlightService;
import com.airline.qantas.translator.FlightTranslator;

@Service
public class FlightServiceImpl implements FlightService {

	@Autowired 
	FlightDao flightDao;
	
	@Override
	public ResponseDto getAllTodaysFlights(String filter) throws NoDataException  {
		List<FlightScheduleModel> list =  flightDao.getAllTodaysFlights(filter);
		FlightTranslator translator=new FlightTranslator();
		ResponseDto response= translator.modelToResponseDto(list);
		return response;
	}

}

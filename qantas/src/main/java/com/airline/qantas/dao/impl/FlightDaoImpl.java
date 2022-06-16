/**
* The FlightDaoImpl interface contains the definition of
*  dao methods operations on flight data
*
* @author  Sunil Mehettar
* @version 1.0
* @since   2022-06-16
*/
package com.airline.qantas.dao.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.airline.qantas.dao.FlightDao;
import com.airline.qantas.exception.NoDataException;
import com.airline.qantas.model.FlightScheduleModel;
import com.airline.qantas.repository.FlightRepository;
import com.airline.qantas.util.DateUtil;


@Repository
public class FlightDaoImpl implements FlightDao{

	@Autowired 
	private FlightRepository repository;

	@Override
	public List<FlightScheduleModel> getAllTodaysFlights()throws NoDataException {

		Date start = DateUtil.atStartOfDay(new Date());
		Date end = DateUtil.atEndOfDay(new Date());
		List<FlightScheduleModel> resp =  repository.findAllByArrivalTimeBetween(start,end);
		if(resp.isEmpty())
			throw new NoDataException();
		return resp;
	}

}

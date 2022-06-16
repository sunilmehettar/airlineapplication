/**
* The FlightDao interface contains the declaration of
*  dao methods on flight data
*
* @author  Sunil Mehettar
* @version 1.0
* @since   2022-06-16 
*/
package com.airline.qantas.dao;

import java.util.List;

import com.airline.qantas.model.FlightScheduleModel;

public interface FlightDao {

	List<FlightScheduleModel> getAllTodaysFlights();

}

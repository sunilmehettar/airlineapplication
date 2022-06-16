/**
* The FlightRepository interface contains the declaration of
*   methods operations on flight database
*
* @author  Sunil Mehettar
* @version 1.0
* @since   2022-06-16
*/

package com.airline.qantas.repository;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.airline.qantas.model.FlightScheduleModel;

public interface FlightRepository extends CrudRepository<FlightScheduleModel, UUID> {

	
	List<FlightScheduleModel> findAllByArrivalTimeBetween(Date start, Date end);
	
	List<FlightScheduleModel> findAllByAirlineModelCodeIgnoreCaseAndArrivalTimeBetween( String filter, Date start, Date end);

}

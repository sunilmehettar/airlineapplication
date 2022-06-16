/**
* The FlightService interface contains the declaration of
*  service methods on flight data
*
* @author  Sunil Mehettar
* @version 1.0
* @since   2022-06-16 
*/

package com.airline.qantas.service;

import com.airline.qantas.dto.ResponseDto;

public interface FlightService {

	ResponseDto getAllTodaysFlights();

}

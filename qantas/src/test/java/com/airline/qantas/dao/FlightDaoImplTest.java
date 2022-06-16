package com.airline.qantas.dao;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;

import com.airline.qantas.dao.impl.FlightDaoImpl;
import com.airline.qantas.exception.NoDataException;
import com.airline.qantas.model.FlightScheduleModel;
import com.airline.qantas.repository.FlightRepository;
import com.airline.qantas.utils.TestCaseUtil;

@RunWith(SpringRunner.class)
public class FlightDaoImplTest {

	List<FlightScheduleModel> modelList;
	
	@InjectMocks
	FlightDaoImpl flightDao;
	
	@Mock
	FlightRepository repository;
	
	@Before
	public void setUp() {

		modelList=TestCaseUtil.getFlightModelList();
	}
	
	@Test
	public void getAllTodaysFlightsAllTest() throws Exception {
		
		when(repository.findAllByArrivalTimeBetween(ArgumentMatchers.any(),ArgumentMatchers.any())).thenReturn(modelList);
		List<FlightScheduleModel> response = flightDao.getAllTodaysFlights("ALL");
		assertNotNull(response);
	}
	
	@Test
	public void getAllTodaysFlightsWithFilterTest() throws Exception {
		
		when(repository.findAllByAirlineModelCodeIgnoreCaseAndArrivalTimeBetween(ArgumentMatchers.any(),ArgumentMatchers.any(),ArgumentMatchers.any())).thenReturn(modelList);
		List<FlightScheduleModel> response = flightDao.getAllTodaysFlights("AA");
		assertNotNull(response);
	}
	
	@Test(expected = NoDataException.class)
	public void getAllTodaysFlightsException() throws Exception {
		
		when(repository.findAllByArrivalTimeBetween(ArgumentMatchers.any(),ArgumentMatchers.any())).thenReturn(Collections.emptyList());
		flightDao.getAllTodaysFlights("ALL");
	}
}

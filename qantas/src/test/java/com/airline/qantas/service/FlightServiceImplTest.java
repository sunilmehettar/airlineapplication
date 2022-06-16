package com.airline.qantas.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;

import com.airline.qantas.dao.FlightDao;
import com.airline.qantas.dto.ResponseDto;
import com.airline.qantas.model.FlightScheduleModel;
import com.airline.qantas.service.impl.FlightServiceImpl;
import com.airline.qantas.utils.TestCaseUtil;

@RunWith(SpringRunner.class)
public class FlightServiceImplTest {

	List<FlightScheduleModel> modelList;
	
	@InjectMocks
	FlightServiceImpl flightService;
	
	@Mock
	FlightDao flightDao;
	
	@Before
	public void setUp() {

		modelList=TestCaseUtil.getFlightModelList();
	}
	
	@Test
	public void getAllTodaysFlightsTest() throws Exception {
		
		when(flightDao.getAllTodaysFlights(ArgumentMatchers.any())).thenReturn(modelList);
		ResponseDto response = flightService.getAllTodaysFlights("ALL");
		assertNotNull(response);
		assertEquals(1, response.getFlights().size());
	}
}

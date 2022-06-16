package com.airline.qantas.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.airline.qantas.dto.ResponseDto;
import com.airline.qantas.service.FlightService;
import com.airline.qantas.utils.TestCaseUtil;


@RunWith(SpringRunner.class)
@WebMvcTest(FlightController.class)
public class FlightControllerTest {

    ResponseDto response;
    
    @Autowired
    private MockMvc mockMvc;
    
    @Autowired
    private WebApplicationContext context;

    @MockBean 
	FlightService flightService;
	
    @Before
    public void setup() {
    	response=TestCaseUtil.getFlightsrResponseDto();
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.context).build();
    }
    
    @Test
    public void getFlightsTest() throws Exception {
       
    	when(flightService.getAllTodaysFlights(ArgumentMatchers.any())).thenReturn(response);
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/v1/flights")
                .accept(MediaType.APPLICATION_JSON).contentType(MediaType.APPLICATION_JSON);
        mockMvc.perform(requestBuilder).andExpect(status().isOk());
    }
}

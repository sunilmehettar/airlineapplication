package com.airline.qantas.model;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "flight_schedule")
public class FlightScheduleModel {

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "id", unique = true, nullable = false)
	private UUID id;

	@Column(name = "flight_code", length = 5, unique=true)
	private String flightCode;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "airline_id", nullable = false, referencedColumnName = "id")
	private AirlineModel airlineModel;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "departure_location_id", nullable = false, referencedColumnName = "id")
	private LocationModel departurePort ;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "arrival_location_id", nullable = false, referencedColumnName = "id")
	private LocationModel arrivalPort ;
	
	@Column(name = "departure_time ")
	private Date departureTime;
	
	@Column(name = "arrival_time ")
	private Date arrivalTime;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getFlightCode() {
		return flightCode;
	}

	public void setFlightCode(String flightCode) {
		this.flightCode = flightCode;
	}

	public AirlineModel getAirlineModel() {
		return airlineModel;
	}

	public void setAirlineModel(AirlineModel airlineModel) {
		this.airlineModel = airlineModel;
	}

	public LocationModel getDeparturePort() {
		return departurePort;
	}

	public void setDeparturePort(LocationModel departurePort) {
		this.departurePort = departurePort;
	}

	public LocationModel getArrivalPort() {
		return arrivalPort;
	}

	public void setArrivalPort(LocationModel arrivalPort) {
		this.arrivalPort = arrivalPort;
	}

	public Date getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}

	public Date getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	
}
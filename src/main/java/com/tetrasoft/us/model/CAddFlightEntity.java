package com.tetrasoft.us.model;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ADDFLIGHT")
public class CAddFlightEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "flight_no",unique = true)
	private String flightNo;
	private String flightName;
	@Column(name = "from_city")
	private String from;
	@Column(name = "to_city")
	private String to;
	@Column(name = "flight_date",columnDefinition = "DATE")
	private LocalDate date;
	@Column(name = "flight_time",columnDefinition = "TIME")
	private LocalTime time;
	
	private Double travelDuration;
	private String source;
	private String destination;
	private Double ticketPrice;
	private String description;
	
	
	public CAddFlightEntity(String flightNo, String flightName, String from, String to, LocalDate date, LocalTime time,
			Double travelDuration, String source, String destination, Double ticketPrice, String description) {
		super();
		this.flightNo = flightNo;
		this.flightName = flightName;
		this.from = from;
		this.to = to;
		this.date = date;
		this.time = time;
		this.travelDuration = travelDuration;
		this.source = source;
		this.destination = destination;
		this.ticketPrice = ticketPrice;
		this.description = description;
	}
	
	
	public CAddFlightEntity() {
	
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}
	public Double getTravelDuration() {
		return travelDuration;
	}
	public void setTravelDuration(Double travelDuration) {
		this.travelDuration = travelDuration;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Double getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(Double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	

}

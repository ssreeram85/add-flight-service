package com.tetrasoft.us.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tetrasoft.us.model.CAddFlightEntity;
import com.tetrasoft.us.service.IAddFlightService;

@RestController
@RequestMapping("/api/flight")
public class AddFlightController {
	
	@Autowired
	private IAddFlightService flightService;
	
	@PostMapping("/add")
	public CAddFlightEntity addFlight(@RequestBody CAddFlightEntity entity) {
		return flightService.save(entity);
	}
	
	@RequestMapping("/flights/{source}/{destination}")
	public List<CAddFlightEntity> findByFlightSourceAndDestination(@PathVariable(name = "source") String source,@PathVariable(name = "destination") String destination){
		return flightService.findBySourceAndDestination(source, destination);
	}
	

}

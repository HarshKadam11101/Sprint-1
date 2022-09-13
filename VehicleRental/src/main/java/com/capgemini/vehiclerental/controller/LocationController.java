package com.capgemini.vehiclerental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.vehiclerental.entity.Location;
import com.capgemini.vehiclerental.service.LocationService;

@RestController
@RequestMapping("/")
public class LocationController {
	
	@Autowired
	LocationService locationservice;
	
	@PostMapping("/save")
	public Location saveBrand(@RequestBody Location location) {
		return locationservice.saveLocation(location);	
	}
	
	@GetMapping("/fetch/{id}")
	public Location fetchLocationById(@PathVariable("id") Integer locationid) {
		return locationservice.fetchLocationById(locationid);

	}


}

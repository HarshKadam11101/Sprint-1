package com.capgemini.vehiclerental.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.vehiclerental.entity.Vehicle;
import com.capgemini.vehiclerental.exception.VehicleNotFoundException;
import com.capgemini.vehiclerental.service.VehicleService;


@RestController
@RequestMapping("/vehicle")
public class VehicleController {

	@Autowired
	VehicleService vehicleservice;
	
	@PostMapping("/save")
	public Vehicle saveVehicle(@RequestBody Vehicle vehicle) {
		return vehicleservice.saveVehicle(vehicle);
	}
		
	@GetMapping("/fetch/{id}")
	public Vehicle fetchVehicleById(@PathVariable("id") Integer vehicleId) throws VehicleNotFoundException {
	return vehicleservice.fetchVehicleById(vehicleId);
	}
	
	@GetMapping("/vehiclelist")
	public List<Vehicle> getAllVehicle() {
		return vehicleservice.getAllVehicle();
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteVehiclebyId(@PathVariable("id") Integer vehicleId) {
		return vehicleservice.deleteVehicleById(vehicleId);
	}
	
	@GetMapping("/get/{name}")
	 public List<Vehicle> fetchVehicleByName(@PathVariable("name") String vehicleName) {
		List<Vehicle> vehicleList = vehicleservice.fetchVehicleByName(vehicleName);
		return vehicleList;		
	}

}

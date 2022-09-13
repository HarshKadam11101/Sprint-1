package com.capgemini.vehiclerental.service;

import java.util.List;

import com.capgemini.vehiclerental.entity.Vehicle;
import com.capgemini.vehiclerental.exception.VehicleNotFoundException;

public interface VehicleService {

	public Vehicle saveVehicle(Vehicle vehicle);

	public Vehicle fetchVehicleById(Integer vehicleId) throws VehicleNotFoundException;

	public List<Vehicle> getAllVehicle();

	public String deleteVehicleById(Integer vehicleId);

	public List<Vehicle> fetchVehicleByName(String vehicleName);

}

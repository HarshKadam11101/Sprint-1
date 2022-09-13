package com.capgemini.vehiclerental.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.vehiclerental.entity.Vehicle;
import com.capgemini.vehiclerental.exception.VehicleNotFoundException;
import com.capgemini.vehiclerental.repository.VehicleRepository;
import com.capgemini.vehiclerental.service.VehicleService;

@Service
public class VehicleServiceImpl implements VehicleService {
	
	@Autowired
	VehicleRepository vehiclerepo;

	@Override
	public Vehicle saveVehicle(Vehicle vehicle) {
		return vehiclerepo.save(vehicle);
	}

	@Override
	public Vehicle fetchVehicleById(Integer vehicleId) throws VehicleNotFoundException {
		Optional<Vehicle> vehicle = vehiclerepo.findById(vehicleId);
		
		if(!vehicle.isPresent()) {
			throw new VehicleNotFoundException("No Vehicle Found ");
		}
		return vehicle.get();
	}

	@Override
	public List<Vehicle> getAllVehicle() {		
		return vehiclerepo.findAll();
	}
	
	@Override
    public String deleteVehicleById(Integer vehicleId) {
		vehiclerepo.deleteById(vehicleId);
		return "Deleted vehicle successfully";
	}

	@Override
	public List<Vehicle> fetchVehicleByName(String vehicleName) {
		return vehiclerepo.findByVehicleNameIgnoreCase(vehicleName);
	}
	
	
	

}

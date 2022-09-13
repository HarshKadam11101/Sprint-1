package com.capgemini.vehiclerental.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.vehiclerental.entity.Location;
import com.capgemini.vehiclerental.repository.LocationRepository;
import com.capgemini.vehiclerental.service.LocationService;

@Service
public class LocationServiceImpl implements LocationService {

	@Autowired 
	LocationRepository locationrepo;
	
	@Override
	public Location saveLocation(Location location) {
		return locationrepo.save(location) ;
	}

	@Override
	public Location fetchLocationById(Integer locationid) {
		return locationrepo.findById(locationid).get();
	}

}

package com.capgemini.vehiclerental.service;

import com.capgemini.vehiclerental.entity.Location;

public interface LocationService {

	public  Location saveLocation(Location location);

	public Location fetchLocationById(Integer locationid);

}

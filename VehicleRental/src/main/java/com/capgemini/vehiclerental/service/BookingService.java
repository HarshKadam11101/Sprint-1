package com.capgemini.vehiclerental.service;

import java.util.List;

import com.capgemini.vehiclerental.entity.Booking;
import com.capgemini.vehiclerental.exception.BookingNotFoundException;

public interface BookingService {

	public Booking saveBooking(Booking booking);

	public Booking fetchBookingById(Integer Booking_id) throws BookingNotFoundException;

	public String deleteBookingbyId(Integer Booking_id);

	public List<Booking> getAllBooking();


	public Booking updateBooking(Booking booking);

	public Float totalRent(Booking booking);

}

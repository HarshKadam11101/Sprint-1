package com.capgemini.vehiclerental.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.vehiclerental.entity.Booking;
import com.capgemini.vehiclerental.exception.BookingNotFoundException;
import com.capgemini.vehiclerental.service.BookingService;

@RestController
@RequestMapping("/booking")
public class BookingController {
	
	@Autowired
	BookingService bookingService;
	
	@PostMapping("/save")
	public Booking saveBooking(@RequestBody @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) Booking booking) {
		return bookingService.saveBooking(booking);	
	}
	
	@GetMapping("/fetch/{id}") 
	public Booking fetchBookingById(@PathVariable("id") Integer Booking_id) throws BookingNotFoundException {
		return bookingService.fetchBookingById(Booking_id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteBookingbyId(@PathVariable("id") Integer Booking_id) {
		return bookingService.deleteBookingbyId(Booking_id);
	}
	
	@GetMapping("/bookinglist")
	public List<Booking> getAllBooking() {
		return bookingService.getAllBooking();
	}
	
	@PutMapping("/update")
    public Booking updateBooking(@RequestBody Booking booking) {
        return bookingService.updateBooking(booking);
    }


	

}

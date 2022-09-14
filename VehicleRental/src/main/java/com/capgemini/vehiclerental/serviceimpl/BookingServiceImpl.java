package com.capgemini.vehiclerental.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.vehiclerental.entity.Booking;
import com.capgemini.vehiclerental.exception.BookingNotFoundException;
import com.capgemini.vehiclerental.repository.BookingRepository;
import com.capgemini.vehiclerental.service.BookingService;

@Service
public class BookingServiceImpl implements BookingService{

	@Autowired
	BookingRepository bookingrepo;
	
	@Override
	public Booking saveBooking(Booking booking) {
		return bookingrepo.save(booking);
	}

	@Override
	public Booking fetchBookingById(Integer Booking_id) throws BookingNotFoundException {
		
        Optional<Booking> booking = bookingrepo.findById(Booking_id);
		
		if(!booking.isPresent()) {
			throw new BookingNotFoundException("No Booking Found ");
		}
		return booking.get();
	}

	@Override
	public String deleteBookingbyId(Integer Booking_id) {
		 bookingrepo.deleteById(Booking_id);
		 return "Booking deleted Successfully";
	}

	@Override
	public List<Booking> getAllBooking() {
		return bookingrepo.findAll();
	}
	

	@Override
	public Booking updateBooking(Booking booking) {
		bookingrepo.saveAndFlush(booking);
		return bookingrepo.getReferenceById(booking.getBooking_id());
	}


	


}

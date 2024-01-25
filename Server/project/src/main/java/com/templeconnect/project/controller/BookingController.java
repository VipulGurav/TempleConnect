package com.templeconnect.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.templeconnect.project.model.BookingMaster;
import com.templeconnect.project.services.BookingRepository;

@RestController
@RequestMapping("/bookings")
@CrossOrigin("*")
public class BookingController {

	@Autowired
	private BookingRepository bookingRepository;

	@GetMapping
	public List<BookingMaster> getAllBookings() {
		return bookingRepository.findAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<BookingMaster> getBookingById(@PathVariable("id") long id) {
		Optional<BookingMaster> booking = bookingRepository.findById(id);
		if (booking.isPresent()) {
			return ResponseEntity.ok(booking.get());
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@PostMapping("/addUpdateBooking")
	public ResponseEntity<BookingMaster> createBooking(@RequestBody BookingMaster booking) {
		BookingMaster savedBooking = bookingRepository.save(booking);
		return ResponseEntity.status(HttpStatus.CREATED).body(savedBooking);
	}
	
	
	@GetMapping("/getBookingByUser/{userid}")
	public ResponseEntity<List<BookingMaster>> getAllUserBooking(@PathVariable Long userid) {
		List<BookingMaster> savedBooking = bookingRepository.findByUserId(userid);
		return ResponseEntity.status(HttpStatus.CREATED).body(savedBooking);
	}
}
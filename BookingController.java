package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Booking;
import com.example.demo.repository.BookingRepository;

@RestController
public class BookingController {

    @Autowired
    private BookingRepository bookingRepo;

    // Book an event
    @PostMapping("/book")
    public String bookEvent(@RequestBody Booking booking) {
        bookingRepo.save(booking);
        return "Booking successful!";
    }

    // View booked events
    @GetMapping("/bookings/{username}")
    public List<Booking> getUserBookings(@PathVariable String username) {
        return bookingRepo.findByUsername(username);
    }
}

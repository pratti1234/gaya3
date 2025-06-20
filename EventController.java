package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Event;
import com.example.demo.repository.EventRepository;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/events")
public class EventController {

    @Autowired
    private EventRepository eventRepo;

    // Add event
    @PostMapping
    public String addEvent(@RequestBody Event event) {
        eventRepo.save(event);
        return "Event saved successfully!";
    }

    // Get all events (used in book-event.html)
    @GetMapping("/all")
    public List<Event> getAllEvents() {
        return eventRepo.findAll();
    }
}

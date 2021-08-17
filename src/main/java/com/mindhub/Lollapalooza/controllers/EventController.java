package com.mindhub.Lollapalooza.controllers;

import com.mindhub.Lollapalooza.repositories.EventRepository;
import com.mindhub.Lollapalooza.repositories.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EventController {

    @Autowired
    EventRepository eventRepository;

    @Autowired
    LocationRepository locationRepository;
}

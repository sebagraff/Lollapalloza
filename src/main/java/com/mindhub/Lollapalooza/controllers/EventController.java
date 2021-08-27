package com.mindhub.Lollapalooza.controllers;

import com.mindhub.Lollapalooza.dtos.EventDTO;
import com.mindhub.Lollapalooza.dtos.LocationDTO;
import com.mindhub.Lollapalooza.dtos.MusicBandDTO;
import com.mindhub.Lollapalooza.repositories.EventRepository;
import com.mindhub.Lollapalooza.repositories.LocationRepository;
import com.mindhub.Lollapalooza.repositories.MusicBandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class EventController {

    @Autowired
    EventRepository eventRepository;

    @Autowired
    MusicBandRepository bandRepository;

    @Autowired
    LocationRepository locationRepository;

    @GetMapping("/events")
    public List<EventDTO> getAll(){
        return this.eventRepository.findAll().stream().map(EventDTO::new).collect(Collectors.toList());
    }

    @GetMapping("/location")
    public List<LocationDTO> getLocation(){
        return this.locationRepository.findAll().stream().map(LocationDTO::new).collect(Collectors.toList());
    }
}

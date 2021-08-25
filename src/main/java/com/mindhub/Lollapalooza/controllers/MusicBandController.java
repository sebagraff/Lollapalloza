package com.mindhub.Lollapalooza.controllers;

import com.mindhub.Lollapalooza.dtos.MusicBandDTO;
import com.mindhub.Lollapalooza.dtos.ProductDTO;
import com.mindhub.Lollapalooza.repositories.EventRepository;
import com.mindhub.Lollapalooza.repositories.MusicBandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class MusicBandController {

    @Autowired
    MusicBandRepository musicBandRepository;

    @Autowired
    EventRepository eventRepository;

    @GetMapping("/musicbands")
    public List<MusicBandDTO> getAll(){
        return this.musicBandRepository.findAll().stream().map(MusicBandDTO::new).collect(Collectors.toList());
    }

    @GetMapping("/viewBands/{id}")
    public MusicBandDTO getBands(@PathVariable Long id){
        return new MusicBandDTO(this.musicBandRepository.findById(id).get());
    }


}

package com.mindhub.Lollapalooza.controllers;

import com.mindhub.Lollapalooza.dtos.MusicBandDTO;
import com.mindhub.Lollapalooza.dtos.ProductDTO;
import com.mindhub.Lollapalooza.models.Event;
import com.mindhub.Lollapalooza.models.Location;
import com.mindhub.Lollapalooza.models.MusicBand;
import com.mindhub.Lollapalooza.repositories.EventRepository;
import com.mindhub.Lollapalooza.repositories.LocationRepository;
import com.mindhub.Lollapalooza.repositories.MusicBandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class MusicBandController {

    @Autowired
    MusicBandRepository musicBandRepository;

    @Autowired
    EventRepository eventRepository;

    @Autowired
    LocationRepository locationRepository;

    @GetMapping("/musicbands")
    public List<MusicBandDTO> getAll(){
        return this.musicBandRepository.findAll().stream().map(MusicBandDTO::new).collect(Collectors.toList());
    }

    @GetMapping("/viewBands/{id}")
    public MusicBandDTO getBands(@PathVariable Long id){
        return new MusicBandDTO(this.musicBandRepository.findById(id).get());
    }

    @DeleteMapping("musicbands/{id}")
    public ResponseEntity<?> deleteBand(@PathVariable Long id){
        musicBandRepository.deleteById(id);
        return new ResponseEntity<>("Eliminado correctamente", HttpStatus.OK);
    }

    @PostMapping("/musicbands")
    public ResponseEntity<?> addBand(@RequestBody MusicBand musicBandDTO){

        Event dia = eventRepository.findByDate(musicBandDTO.getEvent().getDate());


        if(dia == null){
            return new ResponseEntity<>("No se encuentra lo solicitado", HttpStatus.FORBIDDEN);
        }

        if (musicBandDTO.getBandName().isEmpty() || musicBandDTO.getDescription().isEmpty()){
            return new ResponseEntity<>("Faltan datos por ingresar", HttpStatus.FORBIDDEN);
        }

        musicBandRepository.save(new MusicBand(musicBandDTO.getBandName(), musicBandDTO.getGenre(), musicBandDTO.getHour(), musicBandDTO.getDescription(), dia, musicBandDTO.getImage()));
        return new ResponseEntity<>("Banda agregada correctamente!", HttpStatus.OK);

    }

}

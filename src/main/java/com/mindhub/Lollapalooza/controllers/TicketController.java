package com.mindhub.Lollapalooza.controllers;

import com.mindhub.Lollapalooza.dtos.TicketDTO;
import com.mindhub.Lollapalooza.models.Ticket;
import com.mindhub.Lollapalooza.repositories.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class TicketController {
    @Autowired
    TicketRepository ticketRepository;

    @GetMapping("/tickets")
    public List<TicketDTO> getTickets(){
        return this.ticketRepository.findAll().stream().map(TicketDTO::new).collect(Collectors.toList());
    }

    @DeleteMapping("/tickets/{id}")
    public ResponseEntity<?> deleteTicket(@PathVariable Long id){
        Ticket ticket = ticketRepository.findById(id).get();
        ticketRepository.delete(ticket);
        return new ResponseEntity<>("Ticket eliminado con éxito", HttpStatus.OK);
    }

    //@PostMapping("/")
}

package com.mindhub.Lollapalooza.controllers;

import com.mindhub.Lollapalooza.dtos.TicketDTO;
import com.mindhub.Lollapalooza.repositories.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}

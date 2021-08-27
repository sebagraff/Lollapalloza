package com.mindhub.Lollapalooza.controllers;

import com.mindhub.Lollapalooza.dtos.ProductDTO;
import com.mindhub.Lollapalooza.dtos.TicketDTO;
import com.mindhub.Lollapalooza.models.Client;
import com.mindhub.Lollapalooza.models.Product;
import com.mindhub.Lollapalooza.models.Ticket;
import com.mindhub.Lollapalooza.repositories.ClientRepository;
import com.mindhub.Lollapalooza.repositories.TicketRepository;
import com.mindhub.Lollapalooza.utils.MyUtils;
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

    @Autowired
    ClientRepository clientRepository;

    @GetMapping("/tickets")
    public List<TicketDTO> getAll(){
        return this.ticketRepository.findAll().stream().map(TicketDTO::new).collect(Collectors.toList());
   }

}

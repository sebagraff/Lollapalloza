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

    @DeleteMapping("/tickets/{id}")
    public ResponseEntity<?> deleteTicket(@PathVariable Long id){
        Ticket ticket = ticketRepository.findById(id).get();
        ticketRepository.delete(ticket);
        return new ResponseEntity<>("Ticket eliminado con éxito", HttpStatus.OK);
    }

    /*@PostMapping("/products")
    public ResponseEntity<?> addProduct(@RequestBody TicketDTO ticketDTO){
        if(ticketDTO.getNumberCode() == 0 || ticketDTO.getPrice() == 0){
            return new ResponseEntity<>("Por favor, rellena todos lo campos", HttpStatus.FORBIDDEN);
        }

        Client client = clientRepository.findByUser().get();

        this.ticketRepository.save(new Ticket(ticketDTO.getPrice(),ticketDTO.getDate(), MyUtils.getRandomNumber(1,10000), client, ticketDTO.getSede()));
        return new ResponseEntity<>("Producto agregado correctamente", HttpStatus.ACCEPTED);
    }*/
}

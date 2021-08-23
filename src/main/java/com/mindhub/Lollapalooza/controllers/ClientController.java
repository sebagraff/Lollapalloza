package com.mindhub.Lollapalooza.controllers;

import com.mindhub.Lollapalooza.dtos.ClientDTO;
import com.mindhub.Lollapalooza.models.Client;
import com.mindhub.Lollapalooza.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ClientController {

    @Autowired
    public ClientRepository clientRepository;

    @GetMapping("/clients/current")
    public ClientDTO getCurrent(Authentication authentication){
        Client clientAuthenticated= this.clientRepository.findByUser(authentication.getName());
        return new ClientDTO(clientAuthenticated);
    }
}

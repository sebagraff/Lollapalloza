package com.mindhub.Lollapalooza.controllers;

import com.mindhub.Lollapalooza.dtos.ClientDTO;
import com.mindhub.Lollapalooza.models.Cart;
import com.mindhub.Lollapalooza.models.Client;
import com.mindhub.Lollapalooza.repositories.CartRepository;
import com.mindhub.Lollapalooza.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class ClientController {

    @Autowired
    public PasswordEncoder passwordEncoder;

    @Autowired
    public ClientRepository clientRepository;

    @Autowired
    public CartRepository cartRepository;

    @GetMapping("/clients/current")
    public ClientDTO getCurrent(Authentication authentication){
        if (authentication != null) {
            Client clientAuthenticated = this.clientRepository.findByUser(authentication.getName());
            return new ClientDTO(clientAuthenticated);
        }else{
            return new ClientDTO();
        }

    }

    @GetMapping("/clients")
    public List<ClientDTO> getClients (){
        return clientRepository.findAll().stream().map(ClientDTO::new).collect(Collectors.toList());
    }

    @PostMapping("/clients")
    public ResponseEntity<?> register(


            @RequestParam String user, @RequestParam String password) {


        if (user.isEmpty() || password.isEmpty()) {

            return new ResponseEntity<>("Missing data", HttpStatus.FORBIDDEN);

        }


        if (clientRepository.findByUser(user) != null) {

            return new ResponseEntity<>("Name already in use", HttpStatus.FORBIDDEN);

        }

        Client client = new Client(user, passwordEncoder.encode(password));

     

        return new ResponseEntity<>(HttpStatus.CREATED);

    }
}

package com.mindhub.Lollapalooza.controllers;

import com.mindhub.Lollapalooza.dtos.CartDTO;
import com.mindhub.Lollapalooza.dtos.ProductInCartDTO;
import com.mindhub.Lollapalooza.models.Client;
import com.mindhub.Lollapalooza.repositories.CartRepository;
import com.mindhub.Lollapalooza.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CartController {

    @Autowired
    CartRepository cartRepository;

    @Autowired
    ClientRepository clientRepository;

    @GetMapping("/cart/{id}")
    public CartDTO getClientCart(@PathVariable Long id){
        return new CartDTO(this.cartRepository.findById(id).get());
    }
}

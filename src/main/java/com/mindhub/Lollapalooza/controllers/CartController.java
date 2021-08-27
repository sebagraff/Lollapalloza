package com.mindhub.Lollapalooza.controllers;

import com.mindhub.Lollapalooza.dtos.CartDTO;
import com.mindhub.Lollapalooza.dtos.ProductInCartDTO;
import com.mindhub.Lollapalooza.models.Cart;
import com.mindhub.Lollapalooza.models.Client;
import com.mindhub.Lollapalooza.models.ProductInCart;
import com.mindhub.Lollapalooza.models.TicketInCart;
import com.mindhub.Lollapalooza.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class CartController {
    @Autowired
    CartRepository cartRepository;

    @Autowired
    ClientRepository clientRepository;

    @Autowired
    ProductInCartRepository productInCartRepository;

    @Autowired
    TicketInCartRepository ticketInCartRepository;

    @GetMapping("/cart/{id}")
    public CartDTO getClientCart(@PathVariable Long id){
        if (id != 0){
            return new CartDTO(this.cartRepository.findById(id).get());
        }else{
            return new CartDTO();
        }
    }

    @PutMapping("/cart/{id}")
    public ResponseEntity<?> addProductToCart(@PathVariable Long id, @RequestBody Set<ProductInCart> productInCarts){
        Client client = this.clientRepository.findById(id).get();
        Cart cart = client.getCart();

        this.productInCartRepository.deleteAll(cart.getProductsInCart());
        productInCarts.forEach(productInCart -> productInCart.setCart(cart));
        cart.setProductsInCart(productInCarts);
        productInCartRepository.saveAll(productInCarts);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/cart/{id}")
    public ResponseEntity<?> addTicketToCart(@PathVariable Long id, @RequestBody Set<TicketInCart> ticketInCarts){
        Client client = this.clientRepository.findById(id).get();
        Cart cart = client.getCart();

        this.ticketInCartRepository.deleteAll(cart.getTicketsInCart());
        ticketInCarts.forEach(ticketInCart -> ticketInCart.setCart(cart));
        cart.setTicketsInCart(ticketInCarts);
        ticketInCartRepository.saveAll(ticketInCarts);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}

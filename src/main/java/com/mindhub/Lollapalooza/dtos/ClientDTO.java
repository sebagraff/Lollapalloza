package com.mindhub.Lollapalooza.dtos;

import com.mindhub.Lollapalooza.models.Cart;
import com.mindhub.Lollapalooza.models.Client;
import com.mindhub.Lollapalooza.models.Ticket;

import java.util.List;
import java.util.stream.Collectors;

public class ClientDTO {
     private long id;
     private String user;
     private CartDTO cart;
     private List<TicketDTO> tickets;

    public ClientDTO() {
    }

    public ClientDTO(Client client) {
        this.id = client.getId();
        this.user = client.getUser();
        this.cart = new CartDTO(client.getCart());
        this.tickets = client.getTicket().stream().map(TicketDTO::new).collect(Collectors.toList());
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public CartDTO getCart() {
        return cart;
    }

    public void setCart(CartDTO cart) {
        this.cart = cart;
    }

    public List<TicketDTO> getTicket() { return tickets; }

    public void setTicket(List<TicketDTO> ticket) { this.tickets = ticket; }
}

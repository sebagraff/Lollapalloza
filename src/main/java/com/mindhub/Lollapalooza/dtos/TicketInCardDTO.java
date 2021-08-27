package com.mindhub.Lollapalooza.dtos;

import com.mindhub.Lollapalooza.models.Cart;
import com.mindhub.Lollapalooza.models.Ticket;
import com.mindhub.Lollapalooza.models.TicketInCart;

public class TicketInCardDTO {

    private long ticketId;
    private String ticketName;
    private int ticketQuantity;
    private double ticketPrice;

    private Cart cart;

    public TicketInCardDTO(TicketInCart ticketInCart) {
        this.ticketName = ticketInCart.getTicketName();
        this.ticketQuantity = ticketInCart.getTicketQuantity();
        this.ticketPrice = ticketInCart.getTicketPrice();
        this.cart = ticketInCart.getCart();
    }

    public long getTicketId() {return ticketId;}

    public void setTicketId(long ticketId) {this.ticketId = ticketId;}

    public String getTicketName() {return ticketName;}

    public void setTicketName(String ticketName) {this.ticketName = ticketName;}

    public int getTicketQuantity() {return ticketQuantity;}

    public void setTicketQuantity(int ticketQuantity) {this.ticketQuantity = ticketQuantity;}

    public double getTicketPrice() {return ticketPrice;}

    public void setTicketPrice(double ticketPrice) {this.ticketPrice = ticketPrice;}

    /*public Cart getCart() {return cart;}

    public void setCart(Cart cart) {this.cart = cart;}*/
}

package com.mindhub.Lollapalooza.models;

import javax.persistence.*;

public class TicketInCart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long TicketId;

    private String ticketName;
    private int ticketQuantity;
    private double ticketPrice;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Cart")
    private Cart cart;

    public TicketInCart(){}

    public TicketInCart(String ticketName, int ticketQuantity, double ticketPrice) {
        this.ticketName = ticketName;
        this.ticketQuantity = ticketQuantity;
        this.ticketPrice = ticketPrice;
    }

    public long getTicketId() {return TicketId;}

    public void setTicketId(long ticketId) {TicketId = ticketId;}

    public String getTicketName() {return ticketName;}

    public void setTicketName(String ticketName) {this.ticketName = ticketName;}

    public int getTicketQuantity() {return ticketQuantity;}

    public void setTicketQuantity(int ticketQuantity) {this.ticketQuantity = ticketQuantity;}

    public double getTicketPrice() {return ticketPrice;}

    public void setTicketPrice(double ticketPrice) {this.ticketPrice = ticketPrice;}

    public Cart getCart() {return cart;}

    public void setCart(Cart cart) {this.cart = cart;}
}

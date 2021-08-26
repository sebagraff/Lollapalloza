package com.mindhub.Lollapalooza.models;

import javax.persistence.*;

public class TicketInCart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long TicketId;

    private String TicketName;
    private int TicketQuantity;
    private double productPrice;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cart")
    private Cart cart;

    public TicketInCart(){}

    public TicketInCart(String ticketName, int ticketQuantity, double productPrice, com.mindhub.Lollapalooza.models.Cart cart) {
        TicketName = ticketName;
        TicketQuantity = ticketQuantity;
        this.productPrice = productPrice;
        this.cart = cart;
    }

    public long getTicketId() { return TicketId; }

    public void setTicketId(long ticketId) { TicketId = ticketId; }



    public String getTicketName() { return TicketName; }

    public void setTicketName(String ticketName) { TicketName = ticketName; }

    public int getTicketQuantity() { return TicketQuantity; }

    public void setTicketQuantity(int ticketQuantity) { TicketQuantity = ticketQuantity; }

    public double getProductPrice() { return productPrice; }

    public void setProductPrice(double productPrice) { this.productPrice = productPrice; }

    public com.mindhub.Lollapalooza.models.Cart getCart() { return cart; }

    public void setCart(com.mindhub.Lollapalooza.models.Cart cart) { this.cart = cart; }
}

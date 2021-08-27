package com.mindhub.Lollapalooza.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Double totalPrice;

    @OneToMany(mappedBy="cart", fetch=FetchType.EAGER)
    Set<ProductInCart> productsInCart;



    /*@ManyToMany(mappedBy="Cart", fetch = FetchType.EAGER)
    Set<TicketInCart> ticketsInCart;*/

    @OneToOne
    @JoinColumn(name = "Client_id")
    private Client client;

    public Cart() {}

    public Cart(long id, Set<ProductInCart> productsInCart, Set<TicketInCart> ticketsInCart, Double totalPrice) {
        this.id = id;
        this.productsInCart = productsInCart;
        this.totalPrice = totalPrice;
    }

    public long getId() {return id;}

    public void setId(long id) {this.id = id;}

    public Set<ProductInCart> getProductsInCart() {return productsInCart;}

    public void setProductsInCart(Set<ProductInCart> productsInCart) {this.productsInCart = productsInCart;}

    /*public Set<TicketInCart> getTicketsInCart() {return ticketsInCart;}

    public void setTicketsInCart(Set<TicketInCart> ticketsInCart) {this.ticketsInCart = ticketsInCart;}*/

    public Client getClient() {return client;}

    public void setClient(Client client) {this.client = client;}

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
}

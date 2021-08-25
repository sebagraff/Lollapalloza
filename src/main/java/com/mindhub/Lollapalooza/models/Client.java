package com.mindhub.Lollapalooza.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")

    private long id;
    private String user;
    private String password;


    @OneToMany(mappedBy="client", fetch=FetchType.EAGER)
    Set<Comment> comments;

    @OneToMany(mappedBy="client", fetch=FetchType.EAGER)
    Set<Recipt> recipts;

    @OneToMany(mappedBy="client", fetch=FetchType.EAGER)
    Set<ClientEvent> clientEvents;

    @OneToOne
    @JoinColumn(name="Card_id")
    private Cart cart;

    public Client(){}

    public Client(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public String getUser() { return user; }

    public void setUser(String user) { this.user = user; }

    public String getPassword() { return password; }

    public void setPassword(String password) { this.password = password; }

    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }

    public Set<Recipt> getRecipts() {
        return recipts;
    }

    public void setRecipts(Set<Recipt> recipts) {
        this.recipts = recipts;
    }

    public Set<ClientEvent> getClientEvents() {
        return clientEvents;
    }

    public void setClientEvents(Set<ClientEvent> clientEvents) {
        this.clientEvents = clientEvents;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}

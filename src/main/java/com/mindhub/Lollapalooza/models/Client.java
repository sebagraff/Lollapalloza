package com.mindhub.Lollapalooza.models;

import org.hibernate.annotations.GenericGenerator;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")

    private long id;
    private String user;
    private String password;


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
}

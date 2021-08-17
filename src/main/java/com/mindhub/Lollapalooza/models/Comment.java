package com.mindhub.Lollapalooza.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;
    private String description;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="Client_id")
    private Client client;

    public Comment() {
    }

    public Comment(String description, Client client) {
        this.description = description;
        this.client = client;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
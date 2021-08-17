package com.mindhub.Lollapalooza.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Recipt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private ReceiptType type;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="Client_id")
    private Client client;

    @OneToMany(mappedBy="recipt", fetch=FetchType.EAGER)
    Set<Recipt> recipts;

    public Recipt() {
    }

    public Recipt(ReceiptType type, Client client) {
        this.type = type;
        this.client = client;
    }

    public long getId() {
        return id;
    }

    public ReceiptType getType() {
        return type;
    }

    public void setType(ReceiptType type) {
        this.type = type;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}

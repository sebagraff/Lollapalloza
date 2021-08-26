package com.mindhub.Lollapalooza.models;

import javax.persistence.*;

@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private double price;
    private String date;
    private int numberCode;
    private String sede;
    //private int stock;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="Detail_id")
    private Details detail;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="Client_id")
    private Client client;

    public Ticket(){}

    public Ticket(double price, String date, int numberCode,Client client,String sede) {
        this.price = price;
        this.date = date;
        this.numberCode = numberCode;
        //this.stock = stock;
        this.client = client;
        this.sede = sede;
    }

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public double getPrice() { return price; }

    public void setPrice(double price) { this.price = price; }

    public String getDate() { return date; }

    public void setDate(String date) { this.date = date; }

    public int getNumberCode() { return numberCode; }

    public void setNumberCode(int numberCode) { this.numberCode = numberCode; }

    /*public int getStock() { return stock; }

    public void setStock(int stock) { this.stock = stock; }*/

    //public Details getDetail() { return detail; }

    //public void setDetail(Details detail) { this.detail = detail; }

    public Client getClient() { return client; }

    public void setClient(Client client) { this.client = client; }

    public String getSede() { return sede; }

    public void setSede(String sede) { this.sede = sede; }
}

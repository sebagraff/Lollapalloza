package com.mindhub.Lollapalooza.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private double price;
    private LocalDate date;
    private int numberCode;
    private int stock;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="Detail_id")
    private Details detail;

    public Ticket(){}

    public Ticket(double price, LocalDate date, int numberCode, int stock) {
        this.price = price;
        this.date = date;
        this.numberCode = numberCode;
        this.stock = stock;
    }

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public double getPrice() { return price; }

    public void setPrice(double price) { this.price = price; }

    public LocalDate getDate() { return date; }

    public void setDate(LocalDate date) { this.date = date; }

    public int getNumberCode() { return numberCode; }

    public void setNumberCode(int numberCode) { this.numberCode = numberCode; }

    public int getStock() { return stock; }

    public void setStock(int stock) { this.stock = stock; }

    public Details getDetail() {
        return detail;
    }

    public void setDetail(Details detail) {
        this.detail = detail;
    }
}

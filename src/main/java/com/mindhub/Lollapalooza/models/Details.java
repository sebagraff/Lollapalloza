package com.mindhub.Lollapalooza.models;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class Details {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String header;
    private int invoiceNumber;
    private LocalDateTime dateAndTime;
    private String location;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="Recipt_id")
    private Recipt recipt;

    @OneToMany(mappedBy="detail", fetch=FetchType.EAGER)
    Set<Product> products;

    @OneToMany(mappedBy="detail", fetch=FetchType.EAGER)
    Set<Ticket> tickets;
    public Details(){}


    public Details(String header, int invoiceNumber, LocalDateTime dateAndTime, String location, Recipt recipt) {
        this.header = header;
        this.invoiceNumber = invoiceNumber;
        this.dateAndTime = dateAndTime;
        this.location = location;
        this.recipt = recipt;
    }

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public String getHeader() { return header; }

    public void setHeader(String header) { this.header = header; }

    public int getInvoiceNumber() { return invoiceNumber; }

    public void setInvoiceNumber(int invoiceNumber) { this.invoiceNumber = invoiceNumber; }

    public LocalDateTime getDateAndTime() { return dateAndTime; }

    public void setDateAndTime(LocalDateTime dateAndTime) { this.dateAndTime = dateAndTime; }

    public String getLocation() { return location; }

    public void setLocation(String location) { this.location = location; }

    public Recipt getRecipt() {
        return recipt;
    }

    public void setRecipt(Recipt recipt) {
        this.recipt = recipt;
    }
}

package com.mindhub.Lollapalooza.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Details {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String header;
    private int invoiceNumber;
    private LocalDateTime dateAndTime;
    private String location;

    public Details(){}

    public Details(String header, int invoiceNumber, LocalDateTime dateAndTime, String location) {
        this.header = header;
        this.invoiceNumber = invoiceNumber;
        this.dateAndTime = dateAndTime;
        this.location = location;
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
}

package com.mindhub.Lollapalooza.dtos;
import com.mindhub.Lollapalooza.models.Location;
import com.mindhub.Lollapalooza.models.Ticket;
import java.time.LocalDate;

public class TicketDTO {

    private long id;
    private double price;
    private String date;
    private int numberCode;
    private int stock;
    private Location location;

    public TicketDTO(Ticket ticket){
        this.id = ticket.getId();
        this.price = ticket.getPrice();
        this.date = ticket.getDate();
        this.numberCode = ticket.getNumberCode();
        this.stock = ticket.getStock();
    }

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public double getPrice() { return price; }

    public void setPrice(double price) { this.price = price; }

    public String getDate() { return date; }

    public void setDate(String date) { this.date = date; }

    public int getNumberCode() { return numberCode; }

    public void setNumberCode(int numberCode) { this.numberCode = numberCode; }

    public int getStock() { return stock; }

    public void setStock(int stock) { this.stock = stock; }


}

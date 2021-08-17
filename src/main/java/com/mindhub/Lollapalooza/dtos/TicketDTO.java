package com.mindhub.Lollapalooza.dtos;
import com.mindhub.Lollapalooza.models.Ticket;
import java.time.LocalDate;

public class TicketDTO {

    private long id;
    private double monto;
    private LocalDate dia;
    private int numero;
    private int stock;

    public TicketDTO(Ticket ticket){
        this.id = ticket.getId();
        this.monto = ticket.getPrice();
        this.dia = ticket.getDate();
        this.numero = ticket.getNumberCode();
        this.stock = ticket.getStock();
    }

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public double getMonto() { return monto; }

    public void setMonto(double monto) { this.monto = monto; }

    public LocalDate getDia() { return dia; }

    public void setDia(LocalDate dia) { this.dia = dia; }

    public int getNumero() { return numero; }

    public void setNumero(int numero) { this.numero = numero; }

    public int getStock() { return stock; }

    public void setStock(int stock) { this.stock = stock; }
}

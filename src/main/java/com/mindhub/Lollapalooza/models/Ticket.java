package com.mindhub.Lollapalooza.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private double monto;
    private LocalDate dia;
    private int numero;
    private int stock;

    public Ticket(){}

    public Ticket(double monto, LocalDate dia, int numero, int stock) {
        this.monto = monto;
        this.dia = dia;
        this.numero = numero;
        this.stock = stock;
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

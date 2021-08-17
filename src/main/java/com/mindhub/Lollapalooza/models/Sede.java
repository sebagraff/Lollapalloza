package com.mindhub.Lollapalooza.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Sede {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private LocalDate dia;
    private int capacidadMax;

    public Sede() { }

    public Sede(LocalDate dia, int capacidadMax) {
        this.dia = dia;
        this.capacidadMax = capacidadMax;
    }

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public LocalDate getDia() { return dia; }

    public void setDia(LocalDate dia) { this.dia = dia; }

    public int getCapacidadMax() { return capacidadMax; }

    public void setCapacidadMax(int capacidadMax) { this.capacidadMax = capacidadMax; }
}

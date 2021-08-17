package com.mindhub.Lollapalooza.models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private LocalDate dia;
    private String sede;

    public Evento() { }

    public Evento(LocalDate dia, String sede) {
        this.dia = dia;
        this.sede = sede;
    }

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public LocalDate getDia() { return dia; }

    public void setDia(LocalDate dia) { this.dia = dia; }

    public String getSede() { return sede; }

    public void setSede(String sede) { this.sede = sede; }
}

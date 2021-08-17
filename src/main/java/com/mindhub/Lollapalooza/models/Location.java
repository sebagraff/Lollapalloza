package com.mindhub.Lollapalooza.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private LocalDate date;
    private int maximumCapacity;

    public Sede() { }

    public Sede(LocalDate date, int maximumCapacity) {
        this.date = date;
        this.maximumCapacity = maximumCapacity;
    }

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public LocalDate getDate() { return date; }

    public void setDate(LocalDate date) { this.date = date; }

    public int getMaximumCapacity() { return maximumCapacity; }

    public void setMaximumCapacity(int maximumCapacity) { this.maximumCapacity = maximumCapacity; }
}

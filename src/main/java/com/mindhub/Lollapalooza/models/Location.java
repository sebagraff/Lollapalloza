package com.mindhub.Lollapalooza.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private LocalDate date;
    private int maximumCapacity;

    @OneToOne
    @JoinColumn(name="event_id")
    private Event event;

    public Location() { }

    public Location(LocalDate date, int maximumCapacity) {
        this.date = date;
        this.maximumCapacity = maximumCapacity;
    }

    public long getId() { return id; }


    public LocalDate getDate() { return date; }

    public void setDate(LocalDate date) { this.date = date; }

    public int getMaximumCapacity() { return maximumCapacity; }

    public void setMaximumCapacity(int maximumCapacity) { this.maximumCapacity = maximumCapacity; }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
}

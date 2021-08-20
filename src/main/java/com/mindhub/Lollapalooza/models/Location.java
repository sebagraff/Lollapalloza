package com.mindhub.Lollapalooza.models;

import javax.persistence.*;

@Entity
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private int maximumCapacity;

    @OneToOne
    @JoinColumn(name="event_id")
    private Event event;

    public Location() { }

    public Location(String name, int maximumCapacity) {
        this.name = name;
        this.maximumCapacity = maximumCapacity;
    }

    public long getId() { return id; }


    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getMaximumCapacity() { return maximumCapacity; }

    public void setMaximumCapacity(int maximumCapacity) { this.maximumCapacity = maximumCapacity; }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
}

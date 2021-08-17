package com.mindhub.Lollapalooza.models;

import javax.persistence.*;

@Entity
public class Festival {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private Event event;

    public Festival() {
    }

    public Festival(Event event) {
        this.event = event;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
}

package com.mindhub.Lollapalooza.models;

import javax.persistence.*;
import java.time.LocalDateTime;

//

@Entity
public class VisualArts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String artName;
    private LocalDateTime dateAndTime;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="Event_id")
    private Event event;

    public VisualArts() {
    }

    public VisualArts(String artName, LocalDateTime dateAndTime) {
        this.artName = artName;
        this.dateAndTime = dateAndTime;
    }

    public long getId() {
        return id;
    }



    public String getArtName() {
        return artName;
    }

    public void setArtName(String artName) {
        this.artName = artName;
    }

    public LocalDateTime getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(LocalDateTime dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
}

package com.mindhub.Lollapalooza.models;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class MusicBand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String bandName;
    private String genre;
    private LocalDateTime dateAndTime;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="Event_id")
    private Event event;

    public MusicBand() {
    }

    public MusicBand(String bandName, String genre, LocalDateTime dateAndTime, Event event) {
        this.bandName = bandName;
        this.genre = genre;
        this.dateAndTime = dateAndTime;
        this.event = event;
    }

    public long getId() {
        return id;
    }



    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
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

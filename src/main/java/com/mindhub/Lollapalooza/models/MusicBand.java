package com.mindhub.Lollapalooza.models;

import javax.persistence.*;

@Entity
public class MusicBand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String bandName;
    private String genre;
    private String hour;
    private String description;
    private String image;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="Event_id")
    private Event event;

    public MusicBand() {
    }

    public MusicBand(String bandName, String genre, String hour, String description,  Event event, String image) {
        this.bandName = bandName;
        this.genre = genre;
        this.hour = hour;
        this.event = event;
        this.description = description;
        this.image = image;


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

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

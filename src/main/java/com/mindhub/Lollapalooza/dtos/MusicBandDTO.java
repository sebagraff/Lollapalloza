package com.mindhub.Lollapalooza.dtos;

import com.mindhub.Lollapalooza.models.Event;
import com.mindhub.Lollapalooza.models.MusicBand;

public class MusicBandDTO {

    private long id;
    private String bandName;
    private String genre;
    private String hour;
    private String description;
    private String image;
    private String eventDate;

    public MusicBandDTO() {

    }

    public MusicBandDTO(MusicBand musicBand) {
        this.id = musicBand.getId();
        this.bandName = musicBand.getBandName();
        this.genre = musicBand.getGenre();
        this.hour = musicBand.getHour();
        this.description = musicBand.getDescription();
        this.image = musicBand.getImage();
        this.eventDate = musicBand.getEvent().getDate();
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

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }
}

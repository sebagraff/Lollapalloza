package com.mindhub.Lollapalooza.dtos;

import com.mindhub.Lollapalooza.models.Event;
import com.mindhub.Lollapalooza.models.VisualArts;

import java.time.LocalDateTime;

public class VisualArtsDTO {

    private long id;
    private String artName;
    private LocalDateTime dateAndTime;
    private Event event;

    public VisualArtsDTO(VisualArts visualArts){
        this.id = visualArts.getId();
        this.artName = visualArts.getArtName();
        this.dateAndTime = visualArts.getDateAndTime();
        this.event = visualArts.getEvent();
    }

    public long getId() {
        return id; }

    public void setId(long id) { this.id = id; }

    public String getArtName() { return artName; }

    public void setArtName(String artName) { this.artName = artName; }

    public LocalDateTime getDateAndTime() { return dateAndTime; }

    public void setDateAndTime(LocalDateTime dateAndTime) { this.dateAndTime = dateAndTime; }

    public Event getEvent() { return event; }

    public void setEvent(Event event) { this.event = event; }
}

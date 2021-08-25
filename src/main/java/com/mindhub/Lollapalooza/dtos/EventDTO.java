package com.mindhub.Lollapalooza.dtos;

import com.mindhub.Lollapalooza.models.Event;
import com.mindhub.Lollapalooza.models.Festival;
import com.mindhub.Lollapalooza.models.Location;

public class EventDTO {

    private long id;
    private String date;
    private Location location;
    private Festival festival;

    public EventDTO() {
        }

    public EventDTO(Event event) {
        this.date = event.getDate();
        this.location = event.getLocation();
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

}

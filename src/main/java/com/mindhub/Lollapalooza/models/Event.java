package com.mindhub.Lollapalooza.models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private LocalDate date;
    private String location;

    public Event() { }

    public Event(LocalDate date, String location) {
        this.date = date;
        this.location = location;
    }

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public LocalDate getDate() { return date; }

    public void setDate(LocalDate date) { this.date = date; }

    public String getLocation() { return location; }

    public void setLocation(String location) { this.location = location; }
}

package com.mindhub.Lollapalooza.models;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private LocalDate date;

    @OneToMany(mappedBy="event", fetch=FetchType.EAGER)
    Set<ClientEvent> clientEvents;

    @OneToMany(mappedBy="event", fetch=FetchType.EAGER)
    Set<MusicBand> musicBands;

    @OneToMany(mappedBy="event", fetch=FetchType.EAGER)
    Set<VisualArts> visualArts;

    @OneToOne(mappedBy="event")
    private Location location;

    @OneToOne
    @JoinColumn(name="festival_id")
    private Festival festival;

    public Event() { }

    public Event(LocalDate date, Set<ClientEvent> clientEvents) {
        this.date = date;
        this.clientEvents = clientEvents;
    }

    public long getId() { return id; }


    public LocalDate getDate() { return date; }

    public void setDate(LocalDate date) { this.date = date; }



    public Set<ClientEvent> getClientEvents() {
        return clientEvents;
    }

    public void setClientEvents(Set<ClientEvent> clientEvents) {
        this.clientEvents = clientEvents;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Festival getFestival() {
        return festival;
    }

    public void setFestival(Festival festival) {
        this.festival = festival;
    }

    public Set<MusicBand> getMusicBands() {
        return musicBands;
    }

    public void setMusicBands(Set<MusicBand> musicBands) {
        this.musicBands = musicBands;
    }
}

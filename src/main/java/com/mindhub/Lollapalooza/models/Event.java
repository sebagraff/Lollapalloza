package com.mindhub.Lollapalooza.models;
import javax.persistence.*;
import java.util.Set;

@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String date;

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

    public Event(String date, Location location) {
        this.date = date;
        this.location = location;
    }

    public long getId() { return id; }


    public String getDate() { return date; }

    public void setDate(String date) { this.date = date; }



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

    public Set<VisualArts> getVisualArts() {
        return visualArts;
    }

    public void setVisualArts(Set<VisualArts> visualArts) {
        this.visualArts = visualArts;
    }
}

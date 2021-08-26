package com.mindhub.Lollapalooza.dtos;

import com.mindhub.Lollapalooza.models.Location;

public class LocationDTO {

    private String name;
    private int maximumCapacity;

    public LocationDTO() {
    }

    public LocationDTO(Location location) {
        this.name = location.getName();
        this.maximumCapacity = location.getMaximumCapacity();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaximumCapacity() {
        return maximumCapacity;
    }

    public void setMaximumCapacity(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }
}

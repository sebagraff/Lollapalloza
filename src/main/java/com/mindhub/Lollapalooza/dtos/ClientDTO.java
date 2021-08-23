package com.mindhub.Lollapalooza.dtos;

import com.mindhub.Lollapalooza.models.Client;

public class ClientDTO {
     private long id;
     private String user;

    public ClientDTO() {
    }

    public ClientDTO(Client client) {
        this.id = client.getId();
        this.user = client.getUser();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}

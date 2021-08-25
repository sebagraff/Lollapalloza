package com.mindhub.Lollapalooza.dtos;

import com.mindhub.Lollapalooza.models.Client;
import com.mindhub.Lollapalooza.models.Comment;

public class CommentDTO {

    private long id;
    private String description;
    private Client client;

    public CommentDTO(){}

    public CommentDTO(Comment comment){
        this.id = id;
        this.description = comment.getDescription();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}

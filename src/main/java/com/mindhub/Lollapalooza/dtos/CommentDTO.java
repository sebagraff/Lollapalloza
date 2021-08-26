package com.mindhub.Lollapalooza.dtos;

import com.mindhub.Lollapalooza.models.Client;
import com.mindhub.Lollapalooza.models.Comment;

public class CommentDTO {

    private long id;
    private String description;
    private String user;



    public CommentDTO(Comment comment){
        this.id = comment.getId();
        this.description = comment.getDescription();
        this.user = comment.getUser();

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

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}

package com.mindhub.Lollapalooza.dtos;

import com.mindhub.Lollapalooza.models.Comment;
import com.mindhub.Lollapalooza.models.Photo;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class PhotoDTO {

    private long id;
    private String imgTitle;
    private String imgUrl;
    private String description;
    private Set<CommentDTO> comments = new HashSet<>();


    public PhotoDTO(){}

    public PhotoDTO(Photo photo) {
        this.id = photo.getId();
        this.imgTitle = photo.getImgTitle();
        this.imgUrl = photo.getImgUrl();
        this.description = photo.getDescription();
        this.comments = photo.getComments().stream().map(CommentDTO::new).collect(Collectors.toSet());

    }

    public long getId() {
        return id;
    }


    public String getImgTitle() {
        return imgTitle;
    }

    public void setImgTitle(String imgTitle) {
        this.imgTitle = imgTitle;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<CommentDTO> getComments() {
        return comments;
    }

    public void setComment(Set<CommentDTO> comments) {
        this.comments = comments;
    }

}

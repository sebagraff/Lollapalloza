package com.mindhub.Lollapalooza.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import net.minidev.json.annotate.JsonIgnore;


@Entity
public class Photo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String imgTitle;
    private String imgUrl;
    private String description;

    @OneToMany(mappedBy = "photo", fetch = FetchType.EAGER)
    private Set<Comment> comments = new HashSet<>();
    public Set<Comment> getComments() {
        return comments;
    }

    public Photo(){

    }

    public Photo(String imgTitle, String imgUrl, String description) {
        this.imgTitle = imgTitle;
        this.imgUrl = imgUrl;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) { this.id = id; }

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

}


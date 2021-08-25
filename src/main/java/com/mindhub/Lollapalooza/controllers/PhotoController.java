package com.mindhub.Lollapalooza.controllers;

import com.mindhub.Lollapalooza.dtos.MusicBandDTO;
import com.mindhub.Lollapalooza.dtos.PhotoDTO;
import com.mindhub.Lollapalooza.repositories.CommentsRepository;
import com.mindhub.Lollapalooza.repositories.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class PhotoController {

    @Autowired
    PhotoRepository photoRepository;

    @Autowired
    CommentsRepository commentsRepository;

    @RequestMapping("/photos")
    public List<PhotoDTO> getPhotos(){
        return this.photoRepository.findAll().stream().map(PhotoDTO::new).collect(Collectors.toList());
    }

    @RequestMapping("/photos/{id}")
    public PhotoDTO getClient(@PathVariable Long id){
        return this.photoRepository.findById(id).map(PhotoDTO::new).orElse(null);
    }

    CommentController commentController;

}

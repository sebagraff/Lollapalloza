package com.mindhub.Lollapalooza.controllers;

import com.mindhub.Lollapalooza.dtos.CommentDTO;
import com.mindhub.Lollapalooza.dtos.EventDTO;
import com.mindhub.Lollapalooza.repositories.ClientRepository;
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
public class CommentController {

    @Autowired
    ClientRepository clientRepository;

    @Autowired
    PhotoRepository photoRepository;

    @Autowired
    CommentsRepository commentsRepository;


    @RequestMapping("/comments")
    public List<CommentDTO> getComments() {
        return this.commentsRepository.findAll().stream().map(CommentDTO::new).collect(Collectors.toList());
    }

    @RequestMapping("/accounts/{id}")
    public CommentDTO getComment(@PathVariable Long id) {
        return this.commentsRepository.findById(id).map(CommentDTO::new).orElse(null);
    }
}

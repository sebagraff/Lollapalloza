package com.mindhub.Lollapalooza.controllers;

import com.mindhub.Lollapalooza.dtos.ClientDTO;
import com.mindhub.Lollapalooza.dtos.CommentDTO;
import com.mindhub.Lollapalooza.dtos.EventDTO;
import com.mindhub.Lollapalooza.dtos.PhotoDTO;
import com.mindhub.Lollapalooza.models.Client;
import com.mindhub.Lollapalooza.models.Comment;
import com.mindhub.Lollapalooza.models.Photo;
import com.mindhub.Lollapalooza.repositories.ClientRepository;
import com.mindhub.Lollapalooza.repositories.CommentsRepository;
import com.mindhub.Lollapalooza.repositories.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
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

    @RequestMapping("/comments/{id}")
    public CommentDTO getComment(@PathVariable Long id) {
        return this.commentsRepository.findById(id).map(CommentDTO::new).orElse(null);
    }

    @PostMapping("/comments")
    public ResponseEntity<?> addComment(@RequestParam String description, @RequestParam String user, @RequestParam Long id,Authentication authentication){
        Client client = clientRepository.findByUser(authentication.getName());
        Photo photo = photoRepository.findById(id).get();

        if (description.isEmpty()){
            return new ResponseEntity<>("El comentario no puede estar vacío", HttpStatus.FORBIDDEN);
        }

        commentsRepository.save(new Comment(description, user, client, photo));

        return new ResponseEntity<>("Comentario creado con éxito", HttpStatus.OK);

    }

    @DeleteMapping("comments/{id}")
    public ResponseEntity<?> deleteComment(@PathVariable Long id){
        commentsRepository.deleteById(id);
        return new ResponseEntity<>("Eliminado correctamente", HttpStatus.OK);
    }

}
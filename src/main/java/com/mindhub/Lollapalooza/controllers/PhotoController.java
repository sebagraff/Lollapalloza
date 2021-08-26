package com.mindhub.Lollapalooza.controllers;

import com.mindhub.Lollapalooza.dtos.MusicBandDTO;
import com.mindhub.Lollapalooza.dtos.PhotoDTO;
import com.mindhub.Lollapalooza.dtos.ProductDTO;
import com.mindhub.Lollapalooza.models.Photo;
import com.mindhub.Lollapalooza.models.Product;
import com.mindhub.Lollapalooza.repositories.CommentsRepository;
import com.mindhub.Lollapalooza.repositories.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
@CrossOrigin
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

    @DeleteMapping("/photos/{id}")
    public ResponseEntity<?> deletePhoto(@PathVariable Long id){
        Photo photo = photoRepository.findById(id).get();
        photoRepository.delete(photo);
        return new ResponseEntity<>("Eliminado con éxito", HttpStatus.OK);
    }

    // Hay que hacer verificaciones con el usuario logueado

    @PostMapping("/photos")
    public ResponseEntity<?> addPhoto(@RequestBody PhotoDTO photoDTO){

        this.photoRepository.save(new Photo(photoDTO.getImgTitle(), photoDTO.getImgUrl(), photoDTO.getDescription()));
        return new ResponseEntity<>("Producto agregado correctamente", HttpStatus.ACCEPTED);

    }

}

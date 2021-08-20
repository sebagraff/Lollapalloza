package com.mindhub.Lollapalooza.controllers;

import com.mindhub.Lollapalooza.dtos.ProductDTO;
import com.mindhub.Lollapalooza.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProductController {
    @Autowired
    ProductRepository productRepository;

    @GetMapping("/products")
    public List<ProductDTO> getAll(){
        return this.productRepository.findAll().stream().map(ProductDTO::new).collect(Collectors.toList());
    }
}

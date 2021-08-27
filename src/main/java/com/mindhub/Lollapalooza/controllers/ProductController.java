package com.mindhub.Lollapalooza.controllers;

import com.mindhub.Lollapalooza.dtos.ProductDTO;
import com.mindhub.Lollapalooza.models.Product;
import com.mindhub.Lollapalooza.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @DeleteMapping("/products/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable Long id){
        Product product = productRepository.findById(id).get();
        productRepository.delete(product);
        return new ResponseEntity<>("Eliminado con éxito", HttpStatus.OK);
    }

    // Hay que hacer verificaciones con el usuario logueado

    @PostMapping("/products")
    public ResponseEntity<?> addProduct(@RequestBody ProductDTO productDTO){
        if(productDTO.getName().isEmpty() || productDTO.getPrice() == 0 || productDTO.getImage().isEmpty()){
            return new ResponseEntity<>("Por favor, rellena todos lo campos", HttpStatus.FORBIDDEN);
        }

        this.productRepository.save(new Product(productDTO.getName(), productDTO.getPrice(), productDTO.getType(), productDTO.getDescription(), productDTO.getStock(), productDTO.getImage()));
        return new ResponseEntity<>("Producto agregado correctamente", HttpStatus.ACCEPTED);
    }
    @PutMapping("/products")
    public ResponseEntity<?> discountStock(@RequestParam long id){
        Product product = productRepository.findById(id).get();
        product.setStock(product.getStock() - 1);

        productRepository.save(product);
        return new ResponseEntity<>("Descontado con éxito", HttpStatus.OK);
    }
}

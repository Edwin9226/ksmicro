package com.ks.productservice.controller;

import com.ks.productservice.entity.ProductEntity;
import com.ks.productservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public ResponseEntity<List<ProductEntity>> getAllProducts(){
        List<ProductEntity> productEntities= productRepository.findAll() ;
        ResponseEntity<List<ProductEntity>> responseEntity= new ResponseEntity<>(productEntities, HttpStatus.OK );
        return responseEntity;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void createProduct(@RequestBody ProductEntity productEntity){
        productRepository.save(productEntity);
    }
}

package com.mwaisaka.SimpleWeb.controller;

import com.mwaisaka.SimpleWeb.model.Product;
import com.mwaisaka.SimpleWeb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getProducts(){
        return service.getProducts();
    }

    @GetMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId){
        return service.getProductsById(prodId);
    }

    @PostMapping("/products")
    public ResponseEntity<String> addProducts(@RequestBody Product prod){
        //System.out.println(prod); using ResponseEntity instead
        service.addProducts(prod);
        return ResponseEntity.ok("Product added successfully");
    }

    @PutMapping("/products")
    public ResponseEntity<String> updateProduct(@RequestBody Product prod){
        service.updateProduct(prod);
        return ResponseEntity.ok("Product updated successfully");
    }

    @DeleteMapping("/products/{prodId}")
    public ResponseEntity<String> deleteProduct(@PathVariable int prodId){
        service.deleteProduct(prodId);
        return ResponseEntity.ok("Product deleted successfully!");
    }
}

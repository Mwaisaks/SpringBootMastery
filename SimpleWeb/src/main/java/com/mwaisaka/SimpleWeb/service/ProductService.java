package com.mwaisaka.SimpleWeb.service;

import com.mwaisaka.SimpleWeb.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = Arrays.asList(
            new Product(101, "Iphone" , 50000),
            new Product(102, "Camera", 10000),
            new Product(103, "Laptop", 56000));

    public List<Product> getProducts(){
        return null;
    }
}

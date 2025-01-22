package com.mwaisaka.SimpleWeb.service;

import com.mwaisaka.SimpleWeb.model.Product;
import com.mwaisaka.SimpleWeb.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository repository;

//    List<Product> products = new ArrayList<>( Arrays.asList(
//            new Product(101, "Iphone" , 50000),
//            new Product(102, "Camera", 10000),
//            new Product(103, "Laptop", 56000)));

    public List<Product> getProducts(){
        return repository.findAll();
    }

    public Product getProductsById(int prodId) {
        return repository.findById(prodId).orElse(new Product());
    }

    public void addProducts(Product prod){
        repository.save(prod);
    }

    public void updateProduct(Product prod) {
        repository.save(prod);
    }

    public void deleteProduct(int prodId) {
        repository.deleteById(prodId);
    }

            //or rather
//            public void deleteProduct(int prodId){
//                products.removeIf(product -> product.getProdId() == prodId);
//            }

        //not the best logic

}

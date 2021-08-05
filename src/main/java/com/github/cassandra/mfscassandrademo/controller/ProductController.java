package com.github.cassandra.mfscassandrademo.controller;

import com.github.cassandra.mfscassandrademo.data.Product;
import com.github.cassandra.mfscassandrademo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product-controller")
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @PostMapping("/save")
    public Boolean saveNewProduct(@RequestBody Product product){
        try {
            productRepository.insert(product);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}

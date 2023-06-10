package com.java_app.simple_api.controllers;

import com.java_app.simple_api.models.Product;
import com.java_app.simple_api.models.ProductResponse;
import com.java_app.simple_api.services.product.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nexsys/v1/products")
public class ProductController {

    private final ProductService product_service;

    public ProductController(ProductService product_service){
        this.product_service = product_service;
    }

    @GetMapping
    public List<Product> find_products(){
        return this.product_service.find_products();
    }

    @PostMapping
    public String add_product(@RequestBody ProductResponse new_product){
        return this.product_service.add_product(new_product);
    }

}

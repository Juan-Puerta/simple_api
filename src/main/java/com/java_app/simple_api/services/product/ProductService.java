package com.java_app.simple_api.services.product;

import com.java_app.simple_api.models.Product;
import com.java_app.simple_api.models.ProductResponse;

import java.util.List;

public interface ProductService {

    List<Product> find_products();
    String add_product(ProductResponse new_product);

}

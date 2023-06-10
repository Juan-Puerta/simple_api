package com.java_app.simple_api.services.product;

import com.java_app.simple_api.models.Product;
import com.java_app.simple_api.models.ProductResponse;
import com.java_app.simple_api.services.AbstractClient;
import netscape.javascript.JSObject;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@Service
public class ProductServiceImpl extends AbstractClient implements ProductService {
    public ProductServiceImpl(RestTemplate rest_template) {
        super(rest_template);
    }

    @Override
    public List<Product> find_products() {
        String uri = base_url + "/products";

        ResponseEntity<List<Product>> response = rest_template.exchange(
                uri, HttpMethod.GET, null, new ParameterizedTypeReference<List<Product>>() {
        });

        if(response.getStatusCode().is2xxSuccessful()){
            return response.getBody();
        }

        log.error("Error when returning information {}", response.getStatusCode());
        throw new RuntimeException("Error");
    }

    @Override
    public String add_product(ProductResponse new_product) {
        String uri = base_url + "/products";

        ResponseEntity<ProductResponse> response = rest_template.postForEntity(uri, new_product, ProductResponse.class);

        if(response.getStatusCode().is2xxSuccessful()){
            return "{\"pid\":" + response.getBody().getId() + "}";
        }

        log.error("Error in user creation - httpStatus was {}", response.getStatusCode());
        throw new RuntimeException("Error");
    }

}

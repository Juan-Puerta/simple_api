package com.java_app.simple_api.services.category;

import com.java_app.simple_api.models.Category;
import com.java_app.simple_api.models.Product;
import com.java_app.simple_api.services.AbstractClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Slf4j
@Service
public class CategoryServiceImpl extends AbstractClient implements CategoryService {

    public CategoryServiceImpl(RestTemplate rest_template) {
        super(rest_template);
    }

    @Override
    public List<Category> find_categories() {
        String uri = base_url + "/categories";

        ResponseEntity<List<Category>> response = rest_template.exchange(
                uri, HttpMethod.GET, null, new ParameterizedTypeReference<List<Category>>() {
        });

        if(response.getStatusCode().is2xxSuccessful()){
            return response.getBody();
        }

        log.error("Error when returning information {}", response.getStatusCode());
        throw new RuntimeException("Error");
    }
}

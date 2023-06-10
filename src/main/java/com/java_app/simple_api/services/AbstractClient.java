package com.java_app.simple_api.services;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

public abstract class AbstractClient {
    @Value("${platzi.base_url}")
    protected String base_url;

    protected final  RestTemplate rest_template;

    protected AbstractClient(RestTemplate rest_template) {
        this.rest_template = rest_template;
    }
}

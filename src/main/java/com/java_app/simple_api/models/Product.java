package com.java_app.simple_api.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

public class Product {

    @JsonAlias("id")
    @JsonProperty("pid")
    private int id;

    @JsonAlias("title")
    @JsonProperty("name")
    private String title;

    @JsonAlias("price")
    @JsonProperty("priceFinal")
    private int price;

    @JsonProperty("description")
    private String description;

}

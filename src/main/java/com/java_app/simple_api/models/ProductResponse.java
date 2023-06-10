package com.java_app.simple_api.models;

import com.fasterxml.jackson.annotation.*;

public class ProductResponse {

    @JsonProperty("id")
    private int id;

    @JsonAlias("name")
    @JsonProperty("title")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String title;

    @JsonAlias("priceFinal")
    @JsonProperty("price")
    private int price;

    @JsonProperty("description")
    private String description;

    @JsonProperty("categoryId")
    private int category;

    @JsonAlias("imageUrl")
    @JsonProperty("images")
    private String array_string[];


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String[] getArray_string() {
        return array_string;
    }

    public void setArray_string(String[] array_string) {
        this.array_string = array_string;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}

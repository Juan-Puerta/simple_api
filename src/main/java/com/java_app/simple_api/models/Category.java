package com.java_app.simple_api.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Category {

    @JsonAlias("id")
    @JsonProperty("cid")
    private int id;

    @JsonAlias("name")
    @JsonProperty("title")
    private String name;

}

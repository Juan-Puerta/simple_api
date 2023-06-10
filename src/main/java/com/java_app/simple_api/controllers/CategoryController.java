package com.java_app.simple_api.controllers;

import com.java_app.simple_api.models.Category;
import com.java_app.simple_api.services.category.CategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/nexsys/v1/categories")
public class CategoryController {

    private final CategoryService category_service;

    public CategoryController(CategoryService category_service){
        this.category_service = category_service;
    }

    @GetMapping
    public List<Category> find_categories(){
        return this.category_service.find_categories();
    }

}

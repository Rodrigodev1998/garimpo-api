package com.dev.garimpo.service;

import com.dev.garimpo.domain.category.Category;
import com.dev.garimpo.domain.category.CategoryRequestDTO;
import com.dev.garimpo.domain.handler.APIException;
import com.dev.garimpo.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository repository;

    public Category insert(CategoryRequestDTO categoryData){
        Category newCategory = new Category(categoryData);
        this.repository.save(newCategory);
        return newCategory;
    }

    public void delete(String id){
        Category category = this.repository.findById(id)
                .orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Category is not found"));
        this.repository.delete(category);
    }

    public List<Category> getAll() {
        return this.repository.findAll();
    }

    public Optional<Category> getById(String id){
        return this.repository.findById(id);
    }
}

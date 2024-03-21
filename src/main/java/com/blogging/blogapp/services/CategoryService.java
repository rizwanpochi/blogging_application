package com.blogging.blogapp.services;

import com.blogging.blogapp.payloads.CategoryDto;

import java.util.List;

public interface CategoryService {

     //create
    CategoryDto createCategory(CategoryDto categoryDto);
    //update
    CategoryDto updateCategory(CategoryDto categoryDto,Integer categoryId);
    //delete
    void deleteCategory(Integer categoryId);
    //get
    CategoryDto getCategory(Integer categoryId);
    //get ALl
    List<CategoryDto> getCategories();

}

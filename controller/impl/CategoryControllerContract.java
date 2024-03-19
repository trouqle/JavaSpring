package com.orhankaya.n11h2.controller.impl;

import com.orhankaya.n11h2.dto.CategoryDTO;
import com.orhankaya.n11h2.dto.ProductDTO;
import com.orhankaya.n11h2.request.ProductSaveRequest;

import java.util.List;

public interface CategoryControllerContract {

    CategoryDTO saveCategory(ProductSaveRequest request);
    List<CategoryDTO> findAll();

    ProductDTO findById(Long id);

    void delete(Long id);
}

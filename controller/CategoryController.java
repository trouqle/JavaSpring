package com.orhankaya.n11h2.controller;

import com.orhankaya.n11h2.controller.impl.CategoryControllerContract;
import com.orhankaya.n11h2.controller.impl.ProductControllerContract;
import com.orhankaya.n11h2.dto.CategoryDTO;
import com.orhankaya.n11h2.dto.ProductDTO;
import com.orhankaya.n11h2.request.ProductSaveRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/category")
public class CategoryController {

    @PostMapping
    public CategoryDTO saveCustomer(@RequestBody ProductSaveRequest request) {
        CategoryDTO categoryDTO = ProductControllerContract.saveProduct(request);
        return categoryDTO;
    }
    @GetMapping
    public List<CategoryDTO> getAllAccounts() {
        List<CategoryDTO> categoryDTOS = getAllAccounts();
        return categoryDTOS;
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable Long id) {
        CategoryControllerContract.delete(id);
    }

}

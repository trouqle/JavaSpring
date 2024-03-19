package com.orhankaya.n11h2.controller.impl;

import com.orhankaya.n11h2.dto.ProductDTO;
import com.orhankaya.n11h2.request.ProductSaveRequest;
import com.orhankaya.n11h2.request.ProductUpdatePriceRequest;
import com.orhankaya.n11h2.request.ProductUpdateRequest;

import java.time.LocalDateTime;
import java.util.List;

public interface ProductControllerContract {

    ProductDTO saveProduct(ProductSaveRequest request);

    List<ProductDTO> findAll();

    ProductDTO findById(Long id);

    ProductDTO findByCategoryId(Long categoryId);

    List<ProductDTO> findAllByExpirationDateLE(LocalDateTime expirationDate);

    ProductDTO updatePrice(ProductUpdateRequest request);

    ProductDTO batchUpdatePrice(Long id, ProductUpdatePriceRequest productUpdatePriceRequest);

    ProductDTO activate(ProductUpdatePriceRequest productUpdatePriceRequest);

    ProductDTO deactivate(ProductUpdatePriceRequest productUpdatePriceRequest);

}

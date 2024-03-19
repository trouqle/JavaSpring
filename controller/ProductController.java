package com.orhankaya.n11h2.controller;


import com.orhankaya.n11h2.controller.impl.ProductControllerContract;
import com.orhankaya.n11h2.dto.ProductDTO;
import com.orhankaya.n11h2.request.ProductSaveRequest;
import com.orhankaya.n11h2.request.ProductUpdatePriceRequest;
import com.orhankaya.n11h2.request.ProductUpdateRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;


@RestController
@RequestMapping("/api/products")
public class ProductController {

    private ProductControllerContract productControllerContract;

    public ProductController(ProductControllerContract productControllerContract){
        this.productControllerContract = productControllerContract;
    }

    @GetMapping
    public List<ProductDTO> findALl() {
        List<ProductDTO> allCustomers = productControllerContract.findAll();
        return allCustomers;
    }

    @GetMapping("/{id}")
    public ProductDTO findById(@PathVariable Long id) {
        ProductDTO customerById = productControllerContract.findById(id);
        return customerById;
    }

    @GetMapping("/{category_id}")
    public ProductDTO findByCategoryId(@PathVariable Long category_id) {
        ProductDTO findByCategoryId = productControllerContract.findByCategoryId(category_id);
        return findByCategoryId;
    }
//    findAllByExpirationDateLE
     @GetMapping("/{expirataion_date}")
     public List<ProductDTO> findAllByExpirationDateLE(@PathVariable LocalDateTime expirataion_date) {
        List<ProductDTO> expirationById = productControllerContract.findAllByExpirationDateLE(expirataion_date);
        return expirationById;
     }

    @PutMapping("/{debugCustomerId}")
    public ProductDTO updatePrice(@PathVariable Long debugCustomerId,
                                                                    @RequestBody ProductUpdateRequest request) {
        ProductDTO productDTO = productControllerContract.updatePrice(request);
        return productDTO;
    }

    @PatchMapping("/{id}/price")
    public ProductDTO updateCustomerPassword(@PathVariable Long id, @RequestBody
      ProductUpdatePriceRequest request) {
          ProductDTO productDTO = productControllerContract.batchUpdatePrice(id, request);
        return productDTO;
    }

    @PutMapping("/{debugCustomerId}")
    public ProductDTO activate(@PathVariable Long debugCustomerId,
                                  @RequestBody ProductUpdateRequest request) {
        ProductDTO productDTO = productControllerContract.activate(request);
        return productDTO;
    }

    @PutMapping("/{debugCustomerId}")
    public ProductDTO deactivate(@PathVariable Long debugCustomerId,
                               @RequestBody ProductUpdateRequest request) {
        ProductDTO productDTO = productControllerContract.activate(request);
        return productDTO;
    }



    @PostMapping
      public ProductDTO saveCustomer(@RequestBody ProductSaveRequest request) {
        ProductDTO productDto = ProductControllerContract.saveProduct(request);
        return productDto;
     }
}

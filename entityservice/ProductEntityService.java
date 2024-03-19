package com.orhankaya.n11h2.entityservice;

import com.orhankaya.n11h2.dao.ProductRepository;
import com.orhankaya.n11h2.entity.Product;
import com.orhankaya.n11h2.general.BaseEntity;
import com.orhankaya.n11h2.general.BaseEntityService;
import org.springframework.stereotype.Service;

@Service
public class ProductEntityService extends BaseEntityService<Product, ProductRepository> {

    protected ProductEntityService(ProductRepository repository) {
        super(repository);
    }
}

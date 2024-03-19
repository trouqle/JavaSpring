package com.orhankaya.n11h2.transactional;

import com.orhankaya.n11h2.dao.ProductRepository;
import com.orhankaya.n11h2.entity.Product;
import com.orhankaya.n11h2.entityservice.ProductEntityService;
import com.orhankaya.n11h2.general.BaseEntity;
import com.orhankaya.n11h2.general.BaseEntityService;
import com.orhankaya.n11h2.transactional.util.TransactionalUtil;
import jakarta.transaction.Transactional;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class TransactionalService {

    public void saveButError() {

        Product product = TransactionalUtil.getDummyCustomer("batchUpdate");

        ProductEntityService.save(product);
       // ProductRepository.save(product);

        try {
            throw(new Exception());
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("end");
    }
}

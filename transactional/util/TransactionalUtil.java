package com.orhankaya.n11h2.transactional.util;

import com.orhankaya.n11h2.entity.Product;
import com.orhankaya.n11h2.enums.EnumStatus;
import org.springframework.util.StringUtils;

public class TransactionalUtil {
    public static Product getDummyCustomer(String suffix) {

        String testName = "test";
        if (StringUtils.hasText(suffix)) {
            testName = testName + "-" + suffix;
        }

        Product product = new Product();

        product.setName(testName);
        product.setPrice(1000.0);
        product.setStatus(EnumStatus.ACTIVE);

        return product;
    }
}

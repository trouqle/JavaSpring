package com.orhankaya.n11h2.dao;

import com.orhankaya.n11h2.entity.Category;
import com.orhankaya.n11h2.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}

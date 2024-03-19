package com.orhankaya.n11h2.entity;

import com.orhankaya.n11h2.enums.EnumStatus;
import com.orhankaya.n11h2.general.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name="product")
@Getter
@Setter
public class Product extends BaseEntity {

    @SequenceGenerator(name = "Product", sequenceName = "PRODUCT_ID_SEQ")
    @Id
    private Long id;

    @Column(name = "NAME", length = 30)
    private String name;

    @Column(name = "PRICE")
    private Double price;

    @Column(name = "EXPIRATION_DATE")
    private LocalDateTime expirationDate;

    @Column(name = "DESCRIPTION", length = 100)
    private String description;

    @Column(name = "CATEGORY_ID")
    private Long categoryId;

    @Enumerated(EnumType.STRING)
    @Column(name = "STATUS", length = 30)
    private EnumStatus status;
}

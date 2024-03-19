package com.orhankaya.n11h2.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "category")
@Getter
@Setter
public class Category {

    @SequenceGenerator(name = "Category", sequenceName = "CATEGORY_ID_SEQ")
    @Id
    private Long id;

    @Column(name = "NAME", length = 30)
    private String name;
}

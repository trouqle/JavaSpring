package com.orhankaya.n11h2.dto;

import com.orhankaya.n11h2.enums.EnumStatus;

import java.time.LocalDateTime;


public record ProductDTO(Long id,
                         String name,
                         Double price,
                         LocalDateTime expirationDate,
                         String description,
                         Long categoryId,
                         EnumStatus status
                         ) {
}

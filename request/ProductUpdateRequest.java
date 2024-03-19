package com.orhankaya.n11h2.request;

public record ProductUpdateRequest(Long id,
                                   String name,
                                   Double price,
                                   String description) {
}

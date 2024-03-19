package com.orhankaya.n11h2.request;


public record ProductSaveRequest(String name,
                                 Double price,
                                 String description
                                 ) {
}

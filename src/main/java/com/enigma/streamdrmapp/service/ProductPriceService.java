package com.enigma.streamdrmapp.service;

import com.enigma.streamdrmapp.entity.ProductPrice;

public interface ProductPriceService {
    ProductPrice create(ProductPrice productPrice);

    ProductPrice getById(String id);

    ProductPrice findProductIsActive(String productId, Boolean isActive);
}

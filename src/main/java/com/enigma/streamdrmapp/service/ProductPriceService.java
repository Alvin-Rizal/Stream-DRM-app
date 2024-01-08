package com.enigma.streamdrmapp.service;


import com.enigma.streamdrmapp.entity.ProductPrice;
import com.enigma.streamdrmapp.response.ResponseProductPrice;

public interface ProductPriceService {


    ResponseProductPrice createProductPrice(ProductPrice productPrice);

    ResponseProductPrice getPriceById(String id);

    ResponseProductPrice findPriceByIdAndIsActive(String productId, Boolean isActive);
}

package com.enigma.streamdrmapp.service;

import com.enigma.streamdrmapp.request.RequestProduct;
import com.enigma.streamdrmapp.response.ResponseProduct;

import java.util.List;

public interface ProductService {
    ResponseProduct createProduct(RequestProduct requestProduct);
    ResponseProduct updateProduct(RequestProduct requestProduct);
    ResponseProduct getProductByName(String name);
    List<ResponseProduct> getAllProduct();
    void deleteProduct(String name);
}

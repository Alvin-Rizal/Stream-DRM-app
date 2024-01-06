package com.enigma.streamdrmapp.service.impl;

import com.enigma.streamdrmapp.request.RequestProduct;
import com.enigma.streamdrmapp.response.ResponseProduct;
import com.enigma.streamdrmapp.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public ResponseProduct createProduct(RequestProduct requestProduct) {
        return null;
    }

    @Override
    public ResponseProduct updateProduct(RequestProduct requestProduct) {
        return null;
    }

    @Override
    public ResponseProduct getProductByName(String name) {
        return null;
    }

    @Override
    public List<ResponseProduct> getAllProduct() {
        return null;
    }

    @Override
    public void deleteProduct(String name) {

    }
}

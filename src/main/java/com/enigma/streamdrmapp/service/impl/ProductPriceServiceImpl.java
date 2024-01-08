package com.enigma.streamdrmapp.service.impl;

import com.enigma.streamdrmapp.entity.ProductPrice;
import com.enigma.streamdrmapp.repository.ProductPriceRepository;
import com.enigma.streamdrmapp.response.ResponseProductPrice;
import com.enigma.streamdrmapp.service.ProductPriceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductPriceServiceImpl implements ProductPriceService {
    private final ProductPriceRepository productPriceRepository;

    @Override
    public ResponseProductPrice createProductPrice(ProductPrice productPrice) {
        return null;
    }

    @Override
    public ResponseProductPrice getPriceById(String id) {
        return null;
    }

    @Override
    public ResponseProductPrice findPriceByIdAndIsActive(String productId, Boolean isActive) {
        return null;
    }
}

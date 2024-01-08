package com.enigma.streamdrmapp.response;

import com.enigma.streamdrmapp.entity.ProductPrice;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class ResponseProduct {

    private String id;

    private String productName;

    private String description;

    private Integer price;
    private List<ProductPrice> priceList;
}

package com.enigma.streamdrmapp.response;

import com.enigma.streamdrmapp.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class ResponseProductPrice {
    private String id;
    private String productName;
    private Boolean isActive;
}

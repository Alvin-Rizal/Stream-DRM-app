package com.enigma.streamdrmapp.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class RequestProduct {

    private String id;

    private String productName;

    private String description;

    private Integer price;
}

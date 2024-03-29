package com.enigma.streamdrmapp.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class ResponseTransactionDetail {
    private String transactionDetailId;
    private ResponseProduct product;
}

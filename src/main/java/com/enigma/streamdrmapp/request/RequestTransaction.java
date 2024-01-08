package com.enigma.streamdrmapp.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class RequestTransaction {
    private String userId;
    private List<RequestTransactionDetail> transactionDetails;
}

package com.enigma.streamdrmapp.response;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class ResponseUser {
    private String id;
    private String name;
    private String password;
    private String phoneNumber;
}

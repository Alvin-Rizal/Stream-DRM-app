package com.enigma.streamdrmapp.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class RequestAuth {

    private String username;
    private String password;
    private String name;
    private String email;
    private String phone;
}

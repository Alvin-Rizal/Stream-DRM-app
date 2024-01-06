package com.enigma.streamdrmapp.service;

import com.enigma.streamdrmapp.request.RequestAuth;
import com.enigma.streamdrmapp.response.ResponseAdmin;
import com.enigma.streamdrmapp.response.ResponseLogin;
import com.enigma.streamdrmapp.response.ResponseRegister;

public interface AuthService {
    ResponseRegister registerUser(RequestAuth requestAuth);

    ResponseLogin login (RequestAuth requestAuth);

    ResponseAdmin registerAdmin(RequestAuth requestAuth);
}

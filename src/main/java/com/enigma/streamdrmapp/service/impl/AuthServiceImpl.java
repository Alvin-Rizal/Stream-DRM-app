package com.enigma.streamdrmapp.service.impl;

import com.enigma.streamdrmapp.request.RequestAuth;
import com.enigma.streamdrmapp.response.ResponseAdmin;
import com.enigma.streamdrmapp.response.ResponseLogin;
import com.enigma.streamdrmapp.response.ResponseRegister;
import com.enigma.streamdrmapp.service.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public ResponseRegister registerUser(RequestAuth requestAuth) {
        return null;
    }

    @Override
    public ResponseLogin login(RequestAuth requestAuth) {
        return null;
    }

    @Override
    public ResponseAdmin registerAdmin(RequestAuth requestAuth) {
        return null;
    }
}

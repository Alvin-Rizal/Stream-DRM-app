package com.enigma.streamdrmapp.service.impl;

import com.enigma.streamdrmapp.request.RequestUser;
import com.enigma.streamdrmapp.response.ResponseUser;
import com.enigma.streamdrmapp.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public ResponseUser create(RequestUser requestUser) {
        return null;
    }

    @Override
    public ResponseUser update(RequestUser requestUser) {
        return null;
    }

    @Override
    public ResponseUser getUserByName(String name) {
        return null;
    }

    @Override
    public void deleteUser(String id) {

    }

    @Override
    public List<ResponseUser> getAllUSer() {
        return null;
    }
}

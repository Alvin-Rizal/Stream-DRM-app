package com.enigma.streamdrmapp.service;

import com.enigma.streamdrmapp.request.RequestUser;
import com.enigma.streamdrmapp.response.ResponseUser;

public interface UserService {
    ResponseUser create(RequestUser requestUser);
    ResponseUser update(RequestUser requestUser);

    ResponseUser getUserByName(String name);

}

package com.enigma.streamdrmapp.service;

import com.enigma.streamdrmapp.request.RequestUser;
import com.enigma.streamdrmapp.response.ResponseUser;

import java.util.List;

public interface UserService {
    ResponseUser create(RequestUser requestUser);
    ResponseUser update(RequestUser requestUser);
    ResponseUser getUserByName(String name);
    void deleteUser(String id);

    List<ResponseUser> getAllUSer();

}

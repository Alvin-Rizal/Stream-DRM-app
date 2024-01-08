package com.enigma.streamdrmapp.service;

import com.enigma.streamdrmapp.entity.User;
import com.enigma.streamdrmapp.request.RequestUser;
import com.enigma.streamdrmapp.response.ResponseUser;

import java.util.List;

public interface UserService {
    ResponseUser create(User User);
    ResponseUser update(User user);
    ResponseUser getUserByName(String name);
    ResponseUser getUserById(String id);
    void deleteUser(String id);

    List<User> getAllUser();



}

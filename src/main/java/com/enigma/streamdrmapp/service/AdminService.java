package com.enigma.streamdrmapp.service;

import com.enigma.streamdrmapp.entity.Admin;
import com.enigma.streamdrmapp.response.ResponseAdmin;

public interface AdminService {
    ResponseAdmin createNewAdmin(Admin admin);
}

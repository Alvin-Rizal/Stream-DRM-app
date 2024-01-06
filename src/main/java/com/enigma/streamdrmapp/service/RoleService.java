package com.enigma.streamdrmapp.service;

import com.enigma.streamdrmapp.entity.Role;

public interface RoleService {
    Role getOrSave(Role role);
}

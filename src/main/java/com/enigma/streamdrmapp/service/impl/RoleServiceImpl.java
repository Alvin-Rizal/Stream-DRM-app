package com.enigma.streamdrmapp.service.impl;

import com.enigma.streamdrmapp.entity.Role;
import com.enigma.streamdrmapp.repository.RoleRepository;
import com.enigma.streamdrmapp.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {
    public final RoleRepository repository;
    @Override
    public Role getOrSave(Role role) {
        Optional<Role> optionalRole = repository.findByName(role.getName());
        return optionalRole.orElseGet(() -> repository.save(role));
    }
}

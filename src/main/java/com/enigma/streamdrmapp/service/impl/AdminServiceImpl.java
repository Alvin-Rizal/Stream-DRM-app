package com.enigma.streamdrmapp.service.impl;

import com.enigma.streamdrmapp.entity.Admin;
import com.enigma.streamdrmapp.repository.AdminRepository;
import com.enigma.streamdrmapp.response.ResponseAdmin;
import com.enigma.streamdrmapp.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService {
    private final AdminRepository adminRepository;
    @Override
    public ResponseAdmin createNewAdmin(Admin admin) {
        Admin saveAdmin = adminRepository.saveAndFlush(admin);
        return ResponseAdmin.builder()
                .id(saveAdmin.getId())
                .name(saveAdmin.getName())
                .phoneAdmin(saveAdmin.getPhoneNumber())
                .build();
    }
}

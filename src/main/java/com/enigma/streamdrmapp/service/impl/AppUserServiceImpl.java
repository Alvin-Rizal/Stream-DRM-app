package com.enigma.streamdrmapp.service.impl;

import com.enigma.streamdrmapp.entity.AppUser;
import com.enigma.streamdrmapp.entity.UserCredential;
import com.enigma.streamdrmapp.repository.UserCredentialRepository;
import com.enigma.streamdrmapp.service.AppUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AppUserServiceImpl implements AppUserService {
    private final UserCredentialRepository userCredentialRepository;
    @Override
    public AppUser loadUserByUserId(String id) {
        UserCredential userCredential = userCredentialRepository.findById(id).orElseThrow(()->new UsernameNotFoundException("User Not Found"));
        return AppUser.builder()
                .id(userCredential.getId())
                .username(userCredential.getUsername())
                .password(userCredential.getPassword())
                .email(userCredential.getPassword())
                .role(userCredential.getRole().getName())
                .build();
    }

    @Override
    public AppUser loadUserByEmail(String email) {
        UserCredential userCredential = userCredentialRepository.findByEmail(email).orElseThrow(()->new UsernameNotFoundException("User Not Found"));
        return AppUser.builder()
                .id(userCredential.getId())
                .username(userCredential.getUsername())
                .password(userCredential.getPassword())
                .email(userCredential.getPassword())
                .role(userCredential.getRole().getName())
                .build();
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserCredential userCredential = userCredentialRepository.findByUsername(username).orElseThrow(()->new UsernameNotFoundException("User Not Found"));
        return AppUser.builder()
                .id(userCredential.getId())
                .username(userCredential.getUsername())
                .password(userCredential.getPassword())
                .email(userCredential.getPassword())
                .role(userCredential.getRole().getName())
                .build();
    }
}

package com.enigma.streamdrmapp.service;

import com.enigma.streamdrmapp.entity.AppUser;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface AppUserService extends UserDetailsService {
    AppUser loadUserByUserId(String id);
    AppUser loadUserByEmail(String email);

}

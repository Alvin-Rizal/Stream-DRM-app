package com.enigma.streamdrmapp.service.impl;

import com.enigma.streamdrmapp.entity.AppUser;
import com.enigma.streamdrmapp.service.AppUserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AppUserServiceImpl implements AppUserService {
    @Override
    public AppUser loadUserByUserId(String id) {
        return null;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}

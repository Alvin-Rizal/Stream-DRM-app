package com.enigma.streamdrmapp.service.impl;

import com.enigma.streamdrmapp.entity.User;
import com.enigma.streamdrmapp.repository.UserRepository;
import com.enigma.streamdrmapp.request.RequestUser;
import com.enigma.streamdrmapp.response.ResponseUser;
import com.enigma.streamdrmapp.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public ResponseUser getUserById(String id) {
        User user = userRepository.findByIdNative(id);
        return ResponseUser.builder()
                .id(user.getId())
                .userName(user.getName())
                .email(user.getEmail())
                .phoneNumber(user.getPhoneNumber())
                .build();

    }

    @Override
    public ResponseUser create(User user) {
        userRepository.insertUserNative(
                user.getName(),
                user.getEmail(),
                user.getPhoneNumber()
        );
        String generatedId = userRepository.findLastInsertedId();
        ResponseUser savedUser = getUserById(generatedId);
        return ResponseUser.builder()
                .email(savedUser.getEmail())
                .userName(savedUser.getUserName())
                .phoneNumber(savedUser.getPhoneNumber()).build();
    }

    @Override
    public ResponseUser update(User user) {
        if (user.getId() != null) {
            userRepository.updateUserNative(
                    user.getName(),
                    user.getId(),
                    user.getEmail(),
                    user.getPhoneNumber()
            );
            ResponseUser updateUser = getUserById(user.getId());
            return ResponseUser.builder()
                    .email(updateUser.getEmail())
                    .phoneNumber(updateUser.getPhoneNumber())
                    .userName(user.getName())
                    .build();
        }
        return null;
    }

    @Override
    public ResponseUser getUserByName(String name) {
        User user = userRepository.findByNameNative(name);
        return ResponseUser.builder()
                .id(user.getId())
                .userName(user.getName())
                .phoneNumber(user.getPhoneNumber())
                .email(user.getEmail())
                .build();
    }

    @Override
    public void deleteUser(String id) {
        User user = userRepository.findByIdNative(id);
        if (user != null) {
            userRepository.deleteById(id);
        }
    }

    @Override
    public List<User> getAllUser() {
        List<User> users = userRepository.findAllUserNative();
        return users.stream().map(user -> User.builder()
                .name(user.getName())
                .email(user.getName())
                .phoneNumber(user.getPhoneNumber())
                .build()).collect(Collectors.toList());
    }
}

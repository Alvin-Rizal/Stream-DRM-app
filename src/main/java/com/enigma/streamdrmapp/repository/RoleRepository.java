package com.enigma.streamdrmapp.repository;

import com.enigma.streamdrmapp.constant.ERole;
import com.enigma.streamdrmapp.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface RoleRepository extends JpaRepository<Role,String> {
    Optional<Role> findByName(ERole name);
}

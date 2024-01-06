package com.enigma.streamdrmapp.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@Entity
@Table(name = "mst_user_credential")
public class UserCredential {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "username",unique = true,nullable = false)
    private String username;

    private String password;

    private String email;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;
}

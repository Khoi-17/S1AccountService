package com.demo.s1accountserviceproject.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="accountid")
    private Long accountId;

    @Column(name ="username")
    private String username;

    @Column(name ="password")
    private String password;

    @Column(name ="email")
    private String email;

    @ManyToOne
    @JoinColumn(name = "roleid")
    private Role role;
}

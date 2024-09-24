package com.example.demo2.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;




@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Integer age;

    private String email;

    private String password;

    @OneToMany
    private List<Order> order;








}

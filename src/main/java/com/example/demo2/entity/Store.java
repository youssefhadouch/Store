package com.example.demo2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;



@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity

public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String address;
    private int phone;
    private String email;
    @OneToMany(mappedBy ="store",cascade = CascadeType.ALL)
    private List<Product> products;



}

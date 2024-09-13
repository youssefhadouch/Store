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
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String description;
    private double weight;
    private OrderStatus status;

    //for location
    private String pickuplocation;
    private String deliverylocation;
    // for date
    private String orderDate;
    private String deliveryDate;
    //relationships
    @ManyToOne
    private UserEntity userEntity;
    @OneToMany(mappedBy = "order")
    private List<Product> products;



}


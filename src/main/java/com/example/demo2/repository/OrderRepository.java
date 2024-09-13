package com.example.demo2.repository;

import com.example.demo2.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends  JpaRepository<Order, Integer> {


}

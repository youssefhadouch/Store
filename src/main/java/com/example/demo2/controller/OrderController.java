package com.example.demo2.controller;

import com.example.demo2.entity.Order;
import com.example.demo2.service.Orderservice;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private final Orderservice orderservice;


    @PostMapping("/create")
    public Order createOrder(@RequestBody Order order ){
        return orderservice.createOrder( order);
    }
    @PutMapping("/update/{id}")
    public Order updateOrderById(@PathVariable Integer id,@RequestBody Order order){
        return orderservice.updateOrderById( id ,order);
    }

    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable Integer id){
        return orderservice.getOrderById(id );

    }

    @GetMapping("/all")
    public List<Order> getAllOrders(@RequestBody Order order){
        return orderservice.getAllOrders(order);
    }




}

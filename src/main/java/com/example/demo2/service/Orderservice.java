package com.example.demo2.service;

import com.example.demo2.dto.OrderRequest;
import com.example.demo2.entity.Order;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public interface Orderservice {

    Order createOrder( Order order);
    Order updateOrderById( Integer id,  Order order);
    Order getOrderById( Integer id );
    List<Order> getAllOrders(Order order);

    String placeOrder(OrderRequest order);
}

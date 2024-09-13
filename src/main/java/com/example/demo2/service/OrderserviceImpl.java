package com.example.demo2.service;

import com.example.demo2.entity.Order;
import com.example.demo2.entity.OrderStatus;
import com.example.demo2.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderserviceImpl implements Orderservice {

private final OrderRepository orderRepository;


    @Override
    public Order createOrder(Order order) {
        Order ord = new Order();
        ord.setDescription(order.getDescription());
        ord.setWeight(order.getWeight());
        ord.setStatus(OrderStatus.Pending);
        ord.setOrderDate(order.getOrderDate());
        ord.setDeliveryDate(order.getDeliveryDate());
        ord.setPickuplocation(order.getPickuplocation());
        ord.setDeliverylocation(order.getDeliverylocation());


        return orderRepository.save(ord);
    }

    @Override
    public Order updateOrderById(Integer id, Order order) {

        Order ord = orderRepository.findById(id).
                orElseThrow(() -> new RuntimeException("Order not found"));



        ord.setDescription(order.getDescription());
        ord.setWeight(order.getWeight());
        ord.setStatus(order.getStatus());
        ord.setOrderDate(order.getOrderDate());
        ord.setDeliveryDate(order.getDeliveryDate());
        ord.setPickuplocation(order.getPickuplocation());
        ord.setDeliverylocation(order.getDeliverylocation());


        return orderRepository.save(ord);
    }


    @Override
    public Order getOrderById(Integer id) {
         Order order1=  orderRepository.findById(id)
               .orElseThrow(()-> new RuntimeException("Order not found"));
        return order1;
    }

    @Override
    public List<Order> getAllOrders(Order order) {

        return   orderRepository.findAll();
    }
}

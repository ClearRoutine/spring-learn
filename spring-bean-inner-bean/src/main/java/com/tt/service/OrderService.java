package com.tt.service;

import com.tt.repository.OrderRepository;

public class OrderService {

    private OrderRepository orderRepository;

    public void setOrderRepository(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void createOrder(String orderId) {
        System.out.println("OrderService: 创建订单 " + orderId);
        orderRepository.save(orderId);
    }
}

package com.tt.controller;

import com.tt.service.OrderService;

public class OrderController {

    private OrderService orderService;

    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }

    public void handle() {
        System.out.println("OrderController: 处理订单请求");
        orderService.createOrder("ORDER-002");
    }
}

package com.tt.controller;

import com.tt.service.OrderService;

/**
 * 依赖 OrderService，用于演示 property + ref（Setter 注入）
 */
public class OrderController {

    private OrderService orderService;

    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }

    public OrderService getOrderService() {
        return orderService;
    }

    public void handle() {
        System.out.println("OrderController: 处理请求");
        orderService.createOrder("ORDER-001");
    }
}

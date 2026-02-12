package com.tt;

import com.tt.controller.OrderController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 内部 Bean 示例
 *
 * OrderRepository 作为内部 Bean 定义，没有 id/name，只供 OrderService 使用
 */
public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        OrderController orderController = context.getBean("orderController", OrderController.class);
        orderController.handle();
    }
}

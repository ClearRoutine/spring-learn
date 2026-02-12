package com.tt;

import com.tt.controller.OrderController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 自动装配（autowiring）示例 - XML 方式
 *
 * Bean 不指定 id/name，使用 autowire="byType" 按类型自动注入
 */
public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("Application.xml");

        OrderController orderController = context.getBean(OrderController.class);
        orderController.handle();
    }
}

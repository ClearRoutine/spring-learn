package com.tt;

import com.tt.controller.OrderController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 构造器注入演示
 *
 * Spring 通过带参构造方法创建对象，依赖在对象创建时一次性注入完成
 */
public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        OrderController orderController = context.getBean("orderController", OrderController.class);
        orderController.handle();
    }
}

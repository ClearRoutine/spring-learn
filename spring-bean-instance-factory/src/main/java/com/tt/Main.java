package com.tt;

import com.tt.order.Order;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 实例工厂方法创建 Bean 演示
 *
 * 工厂类先实例化为 Bean，再通过 factory-bean + factory-method 调用其实例方法
 */
public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        Order order = context.getBean("order", Order.class);
        System.out.print("无参: ");
        order.handle();

        Order orderV2 = context.getBean("orderV2", Order.class);
        System.out.print("带参: ");
        orderV2.handle();
    }
}

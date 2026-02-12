package com.tt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 静态工厂方法创建 Bean 演示
 *
 * 1. 无参：createService()
 * 2. 带参：createService(String version)，通过 constructor-arg 传入参数
 */
public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        UserFactory userFactory = context.getBean("userFactory", UserFactory.class);
        System.out.print("无参工厂: ");
        userFactory.handle();

        UserFactory userFactoryV2 = context.getBean("userFactoryV2", UserFactory.class);
        System.out.print("带参工厂: ");
        userFactoryV2.handle();
    }
}

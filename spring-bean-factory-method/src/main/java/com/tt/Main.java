package com.tt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 静态工厂方法创建 Bean 演示
 *
 * Spring 调用 UserFactory.createService() 静态方法，
 * 返回值作为 Bean 注册，而非直接实例化 UserFactory
 */
public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        UserFactory userFactory = context.getBean("userService", UserFactory.class);
        userFactory.handle();
    }
}

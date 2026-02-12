package com.tt;

import com.tt.product.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Bean 的 id 和 name 别名演示
 *
 * 用 id 和 name 分别获取 Bean，验证它们是同一个对象实例
 */
public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        // 1. 用 id 获取 Bean
        Product byId = context.getBean("product", Product.class);
        System.out.println("用 id 获取: " + byId.getName());

        // 2. 用 name 中的第一个别名获取 Bean
        Product byAlias1 = context.getBean("productAlias", Product.class);
        System.out.println("用 name 别名 productAlias 获取: " + byAlias1.getName());

        // 3. 用 name 中的第二个别名获取 Bean
        Product byAlias2 = context.getBean("myProduct", Product.class);
        System.out.println("用 name 别名 myProduct 获取: " + byAlias2.getName());

        // 4. 验证：用 id 和 name 获取的是同一个对象实例
        System.out.println("\n--- 验证是否为同一实例 ---");
        System.out.println("byId == byAlias1: " + (byId == byAlias1));
        System.out.println("byId == byAlias2: " + (byId == byAlias2));
        System.out.println("byAlias1 == byAlias2: " + (byAlias1 == byAlias2));
    }
}

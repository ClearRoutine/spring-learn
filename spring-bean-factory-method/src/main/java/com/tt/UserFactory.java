package com.tt;

/**
 * 静态工厂类
 * Spring 调用 createService() 静态方法，返回值作为 Bean 注册
 */
public class UserFactory {

    private UserFactory() {
        // 私有构造，仅通过静态方法创建
    }

    public static UserFactory createService() {
        return new UserFactory();
    }

    public void handle() {
        System.out.println("UserFactory 处理请求");
    }
}

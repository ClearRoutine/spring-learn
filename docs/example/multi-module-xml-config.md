# 多模块 XML 配置

具体实现代码和配置示例可以参考 `spring-xml-web-multi-config` 模块。

# product-config.xml

```java
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="
        http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd">

    <!-- 产品模块配置 -->
    
    <!-- 产品数据访问层 -->
    <bean id="productRepository" class="com.example.repository.ProductRepository"/>

    <!-- 产品服务层 -->
    <bean id="productService" class="com.example.service.ProductService">
        <property name="productRepository" ref="productRepository"/>
    </bean>

    <!-- 产品控制器 -->
    <bean id="productController" class="com.example.controller.ProductController">
        <property name="productService" ref="productService"/>
    </bean>

</beans>
```

# user-config.xml

```java
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="
        http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd">

    <!-- 用户模块配置 -->
    
    <!-- 用户数据访问层 -->
    <bean id="userRepository" class="com.example.repository.UserRepository"/>

    <!-- 用户服务层 -->
    <bean id="userService" class="com.example.service.UserService">
        <property name="userRepository" ref="userRepository"/>
    </bean>

    <!-- 用户控制器 -->
    <bean id="userController" class="com.example.controller.UserController">
        <property name="userService" ref="userService"/>
    </bean>

</beans>
```

# web.xml

```java
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns="https://jakarta.ee/xml/ns/jakartaee"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="https://jakarta.ee/xml/ns/jakartaee
         https://jakarta.ee/xml/ns/jakartaee/web-app_6_0.xsd"
         version="6.0">

    <!-- 配置 Spring 应用上下文的配置文件位置：加载主配置文件（使用 <import/> 导入其他文件） -->
    <context-param>
        <param-name>contextConfigLocation</param-name>
        <param-value>
            classpath:user-config.xml,
            classpath:product-config.xml
        </param-value>
    </context-param>

    <!-- Spring 的上下文加载监听器，会自动创建 ApplicationContext -->
    <listener>
        <listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
    </listener>

    <!-- 用户接口：/user -->
    <servlet>
        <servlet-name>UserServlet</servlet-name>
        <servlet-class>com.example.servlet.UserServlet</servlet-class>
    </servlet>
    
    <servlet-mapping>
        <servlet-name>UserServlet</servlet-name>
        <url-pattern>/user</url-pattern>
    </servlet-mapping>

    <!-- 产品接口：/product -->
    <servlet>
        <servlet-name>ProductServlet</servlet-name>
        <servlet-class>com.example.servlet.ProductServlet</servlet-class>
    </servlet>
    
    <servlet-mapping>
        <servlet-name>ProductServlet</servlet-name>
        <url-pattern>/product</url-pattern>
    </servlet-mapping>

</web-app>
```

[XML 配置 + web.xml](./xml-config-web-xml.md)

这里需要在 `<context-param>` 中的 `contextConfigLocation` 里配置所有需要被加载的配置路径，例如 `classpath:user-config.xml`、`classpath:product-config.xml`，都需要一并写进去。
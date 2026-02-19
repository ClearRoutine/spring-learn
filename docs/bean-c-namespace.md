# c 命名空间

**模块**：`spring-bean-c-namespace`

## 概念

`c` 命名空间用于简化构造器参数的 XML 配置。

## 示例

```xml
<bean id="user" class="com.tt.User" c:manager-ref="manager" c:email="a@b.com"/>
```

等价于：

```xml
<bean id="user" class="com.tt.User">
    <constructor-arg ref="manager"/>
    <constructor-arg value="a@b.com"/>
</bean>
```

- 普通值：`c:参数名="值"`
- Bean 引用：`c:参数名-ref="beanId"`

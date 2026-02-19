# p 命名空间

**模块**：`spring-bean-p-namespace`

## 概念

`p` 命名空间用于简化 `<property>` 的 XML 配置，将属性直接写在 bean 标签上。

## 示例

```xml
<bean id="user" class="com.tt.User" p:email="a@b.com" p:manager-ref="user"/>
```

等价于：

```xml
<bean id="user" class="com.tt.User">
    <property name="email" value="a@b.com"/>
    <property name="manager" ref="user"/>
</bean>
```

- 普通值：`p:属性名="值"`
- Bean 引用：`p:属性名-ref="beanId"`

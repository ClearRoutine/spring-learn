# 链式属性注入 (Property Path)

**模块**：`spring-bean-property-path`

## 概念

Spring XML 支持通过点分路径链式设置嵌套属性，类似 Java 的连续调用：

```xml
<property name="fred.bob.sammy" value="123" />
```

等价于：

```java
something.getFred().getBob().setSammy("123");
```

## 类结构

```
ThingOne → Fred → Bob → sammy (String)
```

## 配置要点

**中间对象不能为 null**。Spring 不会自动创建中间对象，必须显式注入：

```xml
<bean id="bob" class="com.tt.Bob"/>
<bean id="fred" class="com.tt.Fred">
    <property name="bob" ref="bob"/>
</bean>
<bean id="something" class="com.tt.ThingOne">
    <property name="fred" ref="fred"/>
    <property name="fred.bob.sammy" value="123"/>
</bean>
```

若 `fred` 或 `bob` 为 null，链式调用会抛出 `NullPointerException`。

## 运行

```bash
cd spring-bean-property-path
mvn exec:java -Dexec.mainClass="com.tt.Main"
```

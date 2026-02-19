# 日志配置

可以使用 **Logback** 这个日志框架来进行日志配置。`Logback` 是 **Log4j 的后续版本**，由 **Log4j 的创始人亲自开发**，同时也是 **Spring Boot 默认采用的日志框架**。如果需要显式引入 `Logback`，可以使用下面这个依赖。

```xml
<dependency>
    <groupId>ch.qos.logback</groupId>
    <artifactId>logback-classic</artifactId>
    <version>1.2.12</version>
</dependency>
```

想要真正使用 `Logback`，你还需要进行相应的配置，配置文件名称必须定义为 `logback.xml`，并且放在 `resources` 目录下。至于配置文件的具体写法和各项参数含义，需要单独系统地学习，这里就不再展开说明了。

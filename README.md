# Spring Learning

Spring Framework 学习项目，包含示例代码与配套文档。

## 项目结构

多模块 Maven 项目，每个模块演示一个 Spring 知识点。

## 文档

文档位于 [docs/](docs/) 目录，与各模块一一对应：

| 模块 | 说明 |
|------|------|
| [spring-bean-property-path](docs/bean-property-path.md) | XML 链式属性注入 |
| [spring-bean-p-namespace](docs/bean-p-namespace.md) | p 命名空间 |
| [spring-bean-c-namespace](docs/bean-c-namespace.md) | c 命名空间（构造器注入） |
| [spring-bean-collections](docs/bean-collections.md) | 集合注入 |
| [spring-bean-null-and-empty](docs/bean-null-and-empty.md) | null 与空字符串 |
| [spring-bean-inner-bean](docs/bean-inner-bean.md) | 内部 Bean |
| [spring-bean-ref](docs/bean-ref.md) | Bean 引用 |
| ... | 更多见 [docs/README.md](docs/README.md) |

## 运行

```bash
mvn clean compile
# 运行指定模块主类，例如：
cd spring-bean-property-path
mvn exec:java -Dexec.mainClass="com.tt.Main"
```

## 分支

- `master`：主分支，包含代码与文档

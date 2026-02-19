# 文档目录

本目录存放与各模块对应的教程文档，按主题组织。

## Bean 配置

- [链式属性注入 (property-path)](bean-property-path.md) - `fred.bob.sammy` 等价于 `getFred().getBob().setSammy()`
- [p 命名空间](bean-p-namespace.md) - 简化 property 配置
- [c 命名空间](bean-c-namespace.md) - 构造器注入
- [集合注入](bean-collections.md) - list、map、set、props
- [null 与空字符串](bean-null-and-empty.md) - `<null/>` 与 `value=""`
- [内部 Bean](bean-inner-bean.md) - 匿名内部 Bean
- [Bean 引用](bean-ref.md) - ref 与依赖注入

## 其他

- 更多文档待补充，欢迎 PR

## 编写规范

- 每个文档对应一个模块，文件名与模块名对应（如 `bean-property-path.md` 对应 `spring-bean-property-path`）
- 文档内容：概念说明 + 关键代码片段 + 运行方式

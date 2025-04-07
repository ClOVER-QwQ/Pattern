# 意义
## 反射需要获取类名和权限名(即所在包)，那就需要xml信息或者使用注解
## 作用
- 提供一种为程序元素设置元数据的方法
- 元数据是添加到程序元素如方法、字段、类和包上的额外信息
- 注解是一种分散式的元数据设置方式，XML是集中式的设置方式
## 注解的功能
- 作为特定的标记，用于告诉编译器一些信息
- 编译时动态处理，如动态生成代码
- 运行时动态处理，作为额外信息的载体，如获取注解信息
## 注解的分类
- 标准注解：Override、Deprecated、SuppressWarnings
- 元注解:@Retention、@Target、@Inherited、@Documented
- 自定义注解
## 元注解
### 用于修饰注解的注解，通常用在注解的定义上
## 元注解

元注解是用于修饰注解的注解，通常用在注解的定义上。它们定义了注解的行为、作用范围和生命周期。

### @Target

- **作用**：定义注解可以应用的目标类型。
- **取值**：通过 `ElementType` 枚举指定注解可以应用的目标，常见取值包括：
    - `ElementType.TYPE`：类、接口或枚举。
    - `ElementType.METHOD`：方法。
    - `ElementType.FIELD`：成员变量。
    - `ElementType.PARAMETER`：方法参数。
    - `ElementType.ANNOTATION_TYPE`：注解类型。

**示例**：
```java
@Target({ElementType.TYPE, ElementType.METHOD})
@interface MyAnnotation {}
```
## @Retention：注解的生命周期
- RetentionPolicy.SOURCE
- RetentionPolicy.CLASS
- RetentionPolicy.RUNTIME
## @Documented：注解是否应当被包含在JavaDoc文档中
## @Inherited：是否允许子类继承该注解
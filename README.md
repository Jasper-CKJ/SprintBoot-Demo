# SprintBoot-Demo

## 项目简介
`SprintBoot-Demo` 是一个用于学习并实战 `Spring Boot` 的项目

## 开发环境
- **JDK 1.8 +**
- **Maven 3.5 +**
- **Mysql 5.7 +**

## 开发项目
| Module 项目 | Model 介绍 |
|---|---|
|[demo-hello-world](./demo-hello-world)| spring-boot 的第一个 `hello world`|
|[demo-properties](./demo-properties)| 读取配置文件中的内容以及 [自动配置](./demo-properties-starter)|
|[demo-log-aop](./demo-log-aop)| spring-boot 使用 AOP 切面的方式记录 web 请求日志 |
|[demo-exception-handler](./demo-exception-handler)| spring-boot 统一异常处理<br/> 1. 返回统一的 json 格式 <br/> 2. 跳转到统一的异常页面|
|[demo-handler-interceptor](./demo-handler-interceptor)| spring-boot 自定义 HandlerInterceptor 拦截器|
|[demo-map-struct](./demo-map-struct)| [MapStruct](https://github.com/mapstruct/mapstruct-examples) 对象转换 |
|[demo-swagger](./demo-swagger)| Swagger api doc [访问地址](http://127.0.0.1:8080/swagger-ui.html)|
|[demo-jdbc-template](./demo-jdbc-template)| 集成 Jdbc Template 操作数据库，并简易封装通用 Dao 层 |
|[demo-mybatis](./demo-mybatis)| 集成原生 mybatis |
|[demo-mybatis-page-helper](./demo-mybatis-page-helper)| 集成通用的 Mapper 和 PageHelper |
|[demo-mybatis-plus](./demo-mybatis-plus)| 集成 mybatis-plus |
|[demo-redis](./demo-redis)| 整合 redis，操作 redis 中的数据，并使用 redis 缓存数据 |
|[demo-elasticsearch](./demo-elasticsearch)| 集成 ElasticSearch，集成 spring-boot-starter-data-elasticsearch 完成对 ElasticSearch 的高级使用技巧，包括创建索引、配置映射、删除索引、增删改查基本操作、复杂查询、高级查询、聚合查询等 |
|[demo-security](./demo-security)| 集成 spring-security |

SpringBoot2.X
zipkin + ELK + RabbitMQ 分布式链路监控

客户端配置文件 加入rabbitmq配置 及 zipkin接收的rabbitmq 队列  

```
spring:
  rabbitmq:
    addresses: 192.168.19.7
    port: 5672
    username: guest
    password: guest
zipkin:
  rabbitmq:
    queue: zipkin
```

添加 POM 依赖

```
<dependency>
   <groupId>org.springframework.cloud</groupId>
   <artifactId>spring-cloud-starter-zipkin</artifactId>
</dependency>
```

```
<dependency>
   <groupId>org.springframework.amqp</groupId>
   <artifactId>spring-rabbit</artifactId>
</dependency>
```
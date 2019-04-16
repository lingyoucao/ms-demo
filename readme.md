### eureka测试说明

1、启动eureka-server工程
2、访问http://localhost:8761
3、启动service-A工程，刷新http://localhost:8761


### zipkin 测试说明

1、分别启动zipkin-server、zipkin-clinet-1、zipkin-clinet-2

注意：这3个工程的eureka地址可能得修改

2、先访问 http://localhost:8281/service1请求服务

3、访问zipkin界面获取跟踪页面 http://localhost:9411


### 配置中心 测试说明
1、分别启动config-server,config-demo工程

2、访问http://localhost:9001/nl-demo/dev/config  配置中心原理

3、访问http://localhost:8060/hello获取结果

4、修改config-demo工程的bootstrap.properties配置文件中的spring.cloud.config.profile配置项。切换环境变量dev/test/product

5、再次访问http://localhost:8060/hello获取结果

6、配置文件在git上的存放地址：https://github.com/bd-newland/ms-config/tree/config/nl-demo


### 网关 测试说明

1、分别启动api-gateway、service-A、service-B

2、访问如下四个地址

http://localhost:10000/api-a/hello

http://localhost:10000/api-b/hello

http://localhost:10000/api-a/world

http://localhost:10000/api-b/world

### feign 测试
1、分别启动eureka-server、compute-service、compute-service(2)、fegin-client

说明：compute-service(2)通过复制，并更改端口-Dserver.port=8582

2、访问http://localhost:8584/add


### ribbon 测试

1、分别启动eureka-server、compute-service、compute-service(2)、ribbon-client

说明：compute-service(2)通过复制，并更改端口-Dserver.port=8582

2、访问http://localhost:8583/add


### hystrix 测试

1、分别启动eureka-server、hystrix-demo工程
2、多次 访问http://localhost:8587/hello
3、注释掉HystrixCommand
4、再多次 访问http://localhost:8587/hello


### hystrix与feign结合
1、分别启动eureka-server、compute-service、fegin-client

2、访问http://localhost:8584/add

3、停止compute-service

4、再次访问http://localhost:8584/add


### hystrix与ribbon结合
1、分别启动eureka-server、compute-service、ribbon-client

2、访问http://localhost:8583/add

3、停止compute-service

4、再次访问http://localhost:8583/add
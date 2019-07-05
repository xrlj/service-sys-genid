
## 测试环境运行

    docker run --restart=always --name service-sys-genid-test -e "SPRING_PROFILES_ACTIVE=test" -e "EUREKA_INSTANCE_IP-ADDRESS=ip" -p 9013:9013 -d ip:8082/xrlj/service-sys-genid:0.0.1
    
注意：
- 如果配置文件中，没有设置eureka.instance.ip-address，那么在运行docker容器的时候，就要作为参数传该值`EUREKA_INSTANCE_IP-ADDRESS`。否则在不同宿主机中的docker服务，尽管注册在同一个注册中心下，也是无法通讯的。该ip可以是私网，也可以是公网ip，只要不同物理机中能够ping通就行。 

- 如果配置文件中已经配置了该属性，那么直接执行：

        //==========server1
       docker run --restart=always --name service-sys-genid-test -e "SPRING_PROFILES_ACTIVE=test1" -p 9013:9013 -d ip:8082/xrlj/service-sys-genid:0.0.1
       
       //================server2
       docker run --restart=always --name service-sys-genid-test -e "SPRING_PROFILES_ACTIVE=test2" -p 9013:9013 -d ip:8082/xrlj/service-sys-genid:0.0.1
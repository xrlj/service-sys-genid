package com.xrlj.servicesysgenid;

import com.xrlj.framework.base.BaseSpringbootApplication;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@Slf4j
@SpringBootApplication
@ComponentScan(basePackages = {"com.xrlj.servicesysgenid", "com.xrlj.framework"})
@EnableDiscoveryClient
@EnableEurekaClient //可注册到服务中心
@EnableFeignClients
@EnableCircuitBreaker
@RefreshScope
public class ServiceSysGenidApplication extends BaseSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceSysGenidApplication.class, args);
        log.info(">>>>>服务启动成功：{}",args);
    }
}

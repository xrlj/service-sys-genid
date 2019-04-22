package com.xrlj.servicesysgenid;

import com.xrlj.framework.base.BaseSpringbootApplication;
import com.xrlj.framework.spring.config.SchedulingConfig;
import com.xrlj.framework.spring.config.ds.myself.DataSourceConfig;
import com.xrlj.framework.spring.config.ds.myself.JdbcTemplateConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@Slf4j
@SpringBootApplication
@ComponentScan(basePackages = {"com.xrlj.servicesysgenid", "com.xrlj.framework.spring"},excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {SchedulingConfig.class, DataSourceConfig.class, JdbcTemplateConfig.class}))
@EnableDiscoveryClient
@EnableEurekaClient //可注册到服务中心
public class ServiceSysGenidApplication extends BaseSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceSysGenidApplication.class, args);
    }

    @Override
    public void init(ApplicationArguments args) {
        log.info(">>>>>服务启动成功：{}",args);
    }
}

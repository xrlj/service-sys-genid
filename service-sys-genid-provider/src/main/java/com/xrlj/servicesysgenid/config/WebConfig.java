package com.xrlj.servicesysgenid.config;

import com.xrlj.framework.config.AbstractInnerWebConfiguration;
import com.xrlj.framework.config.AbstractWebConfiguration;
import com.xrlj.framework.config.JsonHandlerExceptionResolver;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.Validator;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

import java.util.List;

/**
 * 采用继承WebMvcConfigurationSupport方式。
 * 这种方式会屏蔽springboot的@EnableAutoConfiguration中的设置
 */
@Configuration
public class WebConfig extends AbstractInnerWebConfiguration {

    /**
     * 定义拦截器。
     *
     * @param registry
     */
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        super.addInterceptors(registry);
    }


}

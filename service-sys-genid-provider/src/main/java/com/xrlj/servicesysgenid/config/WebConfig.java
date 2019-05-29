package com.xrlj.servicesysgenid.config;

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
public class WebConfig extends AbstractWebConfiguration {

    /**
     * 全局验证器
     *
     * @return
     */
    @Override
    protected Validator getValidator() {
        return super.getValidator();
    }

    /**
     * 定义拦截器。
     *
     * @param registry
     */
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        super.addInterceptors(registry);
    }

    /**
     * 统一异常处理。
     * @param exceptionResolvers
     */
    @Override
    protected void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> exceptionResolvers) {
        exceptionResolvers.add(new JsonHandlerExceptionResolver());
    }


}

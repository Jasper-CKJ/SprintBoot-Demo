package com.jasper.handlerinterceptor.config;

import com.jasper.handlerinterceptor.interceptor.FirstInterceptor;
import com.jasper.handlerinterceptor.interceptor.SecondInterceptor;
import com.jasper.handlerinterceptor.interceptor.ThirdInterceptor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author jasper
 * @date 2022-04-02 17:11
 */
@Slf4j
@Configuration
public class SpringMvcConfiguration implements WebMvcConfigurer {

    @Bean
    public FirstInterceptor firstInterceptor() {
        return new FirstInterceptor();
    }

    @Bean
    public SecondInterceptor secondInterceptor() {
        return new SecondInterceptor();
    }

    @Bean
    public ThirdInterceptor thirdInterceptor() {
        return new ThirdInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 拦截器一
        registry.addInterceptor(this.firstInterceptor()).addPathPatterns("/**");
        // 拦截器二
        registry.addInterceptor(this.secondInterceptor()).addPathPatterns("/user");
        // 拦截器三
        registry.addInterceptor(this.thirdInterceptor()).addPathPatterns("/**");
    }
}

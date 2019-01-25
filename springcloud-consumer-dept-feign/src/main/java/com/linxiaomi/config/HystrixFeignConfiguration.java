package com.linxiaomi.config;

import feign.Feign;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @Description:
 * @Author: linxiaomi
 * @CreateDate: 2019/1/25 15:00
 * @UpdateDate: 2019/1/25 15:00
 * @Version: 1.0
 **/
@Configuration
public class HystrixFeignConfiguration {

    @Bean
    @Scope("prototype")
    public Feign.Builder feignHystrixBuilder() {
        return Feign.builder();
    }
}

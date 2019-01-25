package com.linxiaomi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Description:
 * @Author: linxiaomi
 * @CreateDate: 2019/1/25 9:20
 * @UpdateDate: 2019/1/25 9:20
 * @Version: 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.linxiaomi"})
@ComponentScan("com.linxiaomi")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

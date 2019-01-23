package com.linxiaomi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description: 启动类
 * @Author:      linxiaomi
 * @CreateDate:  2019/1/23 15:33
 * @UpdateDate:  2019/1/23 15:33
 * @Version:     1.0
 **/
@SpringBootApplication
@EnableEurekaClient
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

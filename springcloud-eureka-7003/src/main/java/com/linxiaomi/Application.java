package com.linxiaomi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description:
 * @Author: linxiaomi
 * @CreateDate: 2019/1/23 18:12
 * @UpdateDate: 2019/1/23 18:12
 * @Version: 1.0
 **/
@SpringBootApplication
@EnableEurekaServer
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

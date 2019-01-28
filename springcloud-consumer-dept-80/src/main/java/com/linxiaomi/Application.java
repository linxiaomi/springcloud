package com.linxiaomi;

import config.MyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Description:
 * @Author: linxiaomi
 * @CreateDate: 2019/1/23 16:12
 * @UpdateDate: 2019/1/23 16:12
 * @Version: 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "SPRINGCLOUD-DEPT", configuration = MyRule.class)
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

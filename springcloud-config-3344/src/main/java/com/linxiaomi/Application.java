package com.linxiaomi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Description:
 * @Author: linxiaomi
 * @CreateDate: 2019/2/4 16:09
 * @UpdateDate: 2019/2/4 16:09
 * @Version: 1.0
 **/
@SpringBootApplication
@EnableConfigServer
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

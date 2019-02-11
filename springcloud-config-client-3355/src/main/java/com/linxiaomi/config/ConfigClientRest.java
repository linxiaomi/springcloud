package com.linxiaomi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: linxiaomi
 * @CreateDate: 2019/2/11 10:38
 * @UpdateDate: 2019/2/11 10:38
 * @Version: 1.0
 **/
@RestController
public class ConfigClientRest {

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServers;

    @Value("${server.port}")
    private String port;

    @RequestMapping("/config")
    public String getConfig() {
        String str = "applicationName: " + applicationName + "\t eurekaServers: " + eurekaServers + "\t port: " + port;
        System.out.println("str: " + str);
        return "applicationName: " + applicationName + "\t eurekaServers: " + eurekaServers + "\t port: " + port;
    }
}

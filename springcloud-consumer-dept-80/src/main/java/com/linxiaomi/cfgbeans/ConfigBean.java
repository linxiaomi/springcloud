package com.linxiaomi.cfgbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Description:
 * @Author: linxiaomi
 * @CreateDate: 2019/1/23 16:02
 * @UpdateDate: 2019/1/23 16:02
 * @Version: 1.0
 **/
@Configuration
public class ConfigBean {

    /**
     * @Description:    RestTemplate提供了多种便捷访问远程Http服务的方法，是一种简单便捷的访问restful服务模板类， 
     *                  是Spring提供的用于访问Rest服务的客户端模板工具集
     *                  使用restTemplate访问restful接口非常的简单粗暴无脑.
     *                  url：REST请求地址
     *                  requestMap：请求参数
     *                  ResponseBean.class：HTTP响应转换被转换成的对象类型
     * @wiki:           https://docs.spring.io/spring-framework/docs/4.3.7.RELEASE/javadoc-api/org/springframework/web/client/RestTemplate.html
     * @Author:         linxiaomi
     * @CreateDate:     2019/1/23 16:04
     * @UpdateUser:     linxiaomi
     * @UpdateDate:     2019/1/23 16:04
     * @UpdateRemark:   
     * @Version:        1.0
     * @return:         
     */
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}

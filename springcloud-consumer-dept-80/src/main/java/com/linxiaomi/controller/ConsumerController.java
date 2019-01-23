package com.linxiaomi.controller;

import com.linxiaomi.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Description:
 * @Author: linxiaomi
 * @CreateDate: 2019/1/23 16:10
 * @UpdateDate: 2019/1/23 16:10
 * @Version: 1.0
 **/
@RestController
public class ConsumerController {

    private static final String REST_URL_PREFIX = "http://localhost:8001";

    @Autowired
    RestTemplate restTemplate;

    /**
     * @Description:
     * @Param:
     * @wiki:
     * @Author:         linxiaomi
     * @CreateDate:     2019/1/23 16:11
     * @UpdateUser:     linxiaomi
     * @UpdateDate:     2019/1/23 16:11
     * @UpdateRemark:   
     * @Version:        1.0
     * @return:         
     */
    @GetMapping(value = "/consumer/dept/add")
    public boolean add (Dept dept) {
        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add", dept, boolean.class);

    }

    /**
     * @Description:
     * @Param:          
     * @wiki:
     * @Author:         linxiaomi
     * @CreateDate:     2019/1/23 16:11
     * @UpdateUser:     linxiaomi
     * @UpdateDate:     2019/1/23 16:11
     * @UpdateRemark:   
     * @Version:        1.0
     * @return:         
     */
    @GetMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id, Dept.class);
    }

    /**
     * @Description:
     * @Param:          
     * @wiki:
     * @Author:         linxiaomi
     * @CreateDate:     2019/1/23 16:11
     * @UpdateUser:     linxiaomi
     * @UpdateDate:     2019/1/23 16:11
     * @UpdateRemark:   
     * @Version:        1.0
     * @return:         
     */
    @GetMapping(value = "/consumer/dept/list")
    public List<Dept> deptList() {
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list", List.class);
    }

}

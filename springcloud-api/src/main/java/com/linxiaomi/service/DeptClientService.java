package com.linxiaomi.service;

import com.linxiaomi.entity.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @Description:
 * @Author: linxiaomi
 * @CreateDate: 2019/1/24 12:26
 * @UpdateDate: 2019/1/24 12:26
 * @Version: 1.0
 **/
@FeignClient(value = "springcloud-dept", fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {

    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    Dept get(@PathVariable("id") Long id);

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    List<Dept> list();

    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    boolean add(Dept dept);
}

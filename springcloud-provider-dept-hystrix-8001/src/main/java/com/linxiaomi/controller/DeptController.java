package com.linxiaomi.controller;

import com.linxiaomi.entity.Dept;
import com.linxiaomi.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description:
 * @Author: linxiaomi
 * @CreateDate: 2019/1/23 15:31
 * @UpdateDate: 2019/1/23 15:31
 * @Version: 1.0
 **/
@RestController
public class DeptController {

    @Autowired
    DeptService deptService;

    /**
     * @Description:    增加部门信息
     * @Param:          Dept
     * @Author:         linxiaomi
     * @CreateDate:     2019/1/23 15:32
     * @UpdateUser:     linxiaomi
     * @UpdateDate:     2019/1/23 15:32
     * @UpdateRemark:   
     * @Version:        1.0
     * @return:         
     */
    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept) {
        return deptService.add(dept);
    }

    /**
     * @Description:    根据部门id查询部门信息
     * @Param:          id：部门id
     * @Author:         linxiaomi
     * @CreateDate:     2019/1/23 15:32
     * @UpdateUser:     linxiaomi
     * @UpdateDate:     2019/1/23 15:32
     * @UpdateRemark:   
     * @Version:        1.0
     * @return:         
     */
    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "processHystrixGet")
    public Dept get(@PathVariable("id") Long id) {
        Dept dept = deptService.get(id);
        if (null == dept) {
            throw new RuntimeException("该id : " + id + "没有对应的信息");
        }
        return dept;
    }

    public Dept processHystrixGet(@PathVariable("id") Long id) {
        Dept dept = new Dept();
        dept.setDeptNo(id);
        dept.setDname("该ID：" + id + "没有没有对应的信息,null--@HystrixCommand");
        dept.setDb_source("no this database in MySQL");
        return dept;
    }

    /**
     * @Description:    查询所有部门信息
     * @Author:         linxiaomi
     * @CreateDate:     2019/1/23 15:32
     * @UpdateUser:     linxiaomi
     * @UpdateDate:     2019/1/23 15:32
     * @UpdateRemark:   
     * @Version:        1.0
     * @return:         
     */
    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list() {
        return deptService.list();
    }
}

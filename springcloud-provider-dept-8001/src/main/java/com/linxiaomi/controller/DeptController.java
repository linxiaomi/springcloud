package com.linxiaomi.controller;

import com.linxiaomi.entity.Dept;
import com.linxiaomi.service.DeptService;
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
    public Dept get(@PathVariable("id") Long id) {
        return deptService.get(id);
    }

    /**
     * @Description:    查询所有部门信息
     * @Param:
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

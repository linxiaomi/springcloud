package com.linxiaomi.service;

import com.linxiaomi.entity.Dept;

import java.util.List;

/**
 * @Description:    deptService
 * @Author:         linxiaomi
 * @CreateDate:     2019/1/23 15:28
 * @UpdateUser:     linxiaomi
 * @UpdateDate:     2019/1/23 15:28
 * @UpdateRemark:   
 * @Version:        1.0
 */
public interface DeptService {

    /**
     * @Description:    增加部门信息
     * @Param:          dept
     * @Author:         linxiaomi
     * @CreateDate:     2019/1/23 15:28
     * @UpdateUser:     linxiaomi
     * @UpdateDate:     2019/1/23 15:28
     * @UpdateRemark:
     * @Version:        1.0
     * @return:
     */
    boolean add(Dept dept);

    /**
     * @Description:    根据部门id查询部门信息
     * @Param:          id：部门id
     * @Author:         linxiaomi
     * @CreateDate:     2019/1/23 15:29
     * @UpdateUser:     linxiaomi
     * @UpdateDate:     2019/1/23 15:29
     * @UpdateRemark:   
     * @Version:        1.0
     * @return:         
     */
    Dept get(Long id);

    /**
     * @Description:    查询所有部门信息
     * @Author:         linxiaomi
     * @CreateDate:     2019/1/23 15:29
     * @UpdateUser:     linxiaomi
     * @UpdateDate:     2019/1/23 15:29
     * @UpdateRemark:   
     * @Version:        1.0
     * @return:         
     */
    List<Dept> list();
}

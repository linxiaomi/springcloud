package com.linxiaomi.service;

import com.linxiaomi.entity.Dept;

import java.util.List;

/**
 * @Description: deptService
 * @Author:      linxiaomi
 * @CreateDate:  2019/1/24 10:52
 * @UpdateDate:  2019/1/24 10:52
 * @Version:     1.0
 **/
public interface DeptService {

    /**
     * @Description:    增加部门信息
     * @Param:          dept
     * @Author:         linxiaomi
     * @CreateDate:     2019/1/24 10:53
     * @UpdateUser:     linxiaomi
     * @UpdateDate:     2019/1/24 10:53
     * @UpdateRemark:   
     * @Version:        1.0
     * @return:         
     */
    boolean add(Dept dept);

    /**
     * @Description:    根据部门id查询部门信息
     * @Param:          id：部门id
     * @wiki:
     * @Author:         linxiaomi
     * @CreateDate:     2019/1/24 10:53
     * @UpdateUser:     linxiaomi
     * @UpdateDate:     2019/1/24 10:53
     * @UpdateRemark:   
     * @Version:        1.0
     * @return:         
     */
    Dept get(Long id);

    /**
     * @Description:    查询所有部门信息
     * @Param:
     * @wiki:
     * @Author:         linxiaomi
     * @CreateDate:     2019/1/24 10:53
     * @UpdateUser:     linxiaomi
     * @UpdateDate:     2019/1/24 10:53
     * @UpdateRemark:   
     * @Version:        1.0
     * @return:         
     */
    List<Dept> list();
}

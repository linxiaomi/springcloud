package com.linxiaomi.service.impl;

import com.linxiaomi.entity.Dept;
import com.linxiaomi.service.DeptService;
import com.linxiaomi.dao.DeptDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author: linxiaomi
 * @CreateDate: 2019/1/23 15:30
 * @UpdateDate: 2019/1/23 15:30
 * @Version: 1.0
 **/
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    DeptDao deptDao;

    @Override
    public boolean add(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return deptDao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return deptDao.findAll();
    }
}

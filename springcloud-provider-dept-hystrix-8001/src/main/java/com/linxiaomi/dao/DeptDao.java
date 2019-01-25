package com.linxiaomi.dao;

import com.linxiaomi.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Description:
 * @Author: linxiaomi
 * @CreateDate: 2019/1/23 15:26
 * @UpdateDate: 2019/1/23 15:26
 * @Version: 1.0
 **/
@Mapper
public interface DeptDao {

    boolean addDept(Dept dept);

    Dept findById(Long id);

    List<Dept> findAll();
}

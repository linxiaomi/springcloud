package com.linxiaomi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @Description:
 * @Author: linxiaomi
 * @CreateDate: 2019/1/23 14:44
 * @UpdateDate: 2019/1/23 14:44
 * @Version: 1.0
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept {

    private Long deptNo;
    private String dname;
    private String db_source;

    public Long getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(Long deptNo) {
        this.deptNo = deptNo;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDb_source() {
        return db_source;
    }

    public void setDb_source(String db_source) {
        this.db_source = db_source;
    }
}

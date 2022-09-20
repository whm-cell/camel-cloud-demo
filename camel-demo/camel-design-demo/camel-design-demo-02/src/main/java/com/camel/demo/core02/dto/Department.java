package com.camel.demo.core02.dto;

/**
 * @Title: Department
 * @Description:
 * @author: wanghaiming
 * @date: 2022/9/20 0020 17:14
 * @Version: 1.0
 */
public class Department {

    private long id;
    private String deptName;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getDeptName() {
        return deptName;
    }
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

}

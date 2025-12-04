package com.demo.service;

import com.demo.dao.DepartmentDao;
import com.demo.beans.Department;

public class DepartmentService {

    private DepartmentDao deptDao = new DepartmentDao();

    public int createDepartment(String name) {
        Department dept = new Department(name);
        return deptDao.addDepartment(dept);
    }
}

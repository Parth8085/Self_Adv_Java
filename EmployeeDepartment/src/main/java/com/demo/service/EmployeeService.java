package com.demo.service;

import java.util.List;

import com.demo.dao.EmployeeDao;
import com.demo.beans.Department;
import com.demo.beans.Employee;

public class EmployeeService {

    private EmployeeDao empDao = new EmployeeDao();

    public int addEmployee(String empName, double salary, Department dept) {
        Employee emp = new Employee(empName, salary, dept);
        return empDao.addEmployee(emp);
    }

    public List<Employee> listEmpByDept(int deptId) {
        return empDao.getEmployeesByDeptId(deptId);
    }

    public void removeEmployee(int empId) {
        empDao.deleteEmployee(empId);
    }
}

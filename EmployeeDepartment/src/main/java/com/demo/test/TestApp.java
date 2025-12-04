package com.demo.test;

import java.util.List;

import com.demo.beans.Department;
import com.demo.beans.Employee;
import com.demo.service.DepartmentService;
import com.demo.service.EmployeeService;
import com.demo.util.HibernateUtil;

public class TestApp {
    public static void main(String[] args) {

        DepartmentService deptService = new DepartmentService();
        EmployeeService empService = new EmployeeService();

        // 1. Add Department
        int deptId = deptService.createDepartment("IT");
        System.out.println("Department Created: " + deptId);

        // Create Dept object to use while adding employee
        Department dept = new Department();
        dept.setDeptId(deptId);

        // 2. Add Employees under Department
        empService.addEmployee("Parth", 50000, dept);
        empService.addEmployee("Sarthak", 60000, dept);

        // 3. List Employees by Department (HQL)
        System.out.println("\nEmployees in Department ID: " + deptId);
        List<Employee> list = empService.listEmpByDept(deptId);
        for (Employee e : list) {
            System.out.println(e.getEmpId() + " | " + e.getEmpName() + " | " + e.getSalary());
        }

        // 4. Delete an employee
        empService.removeEmployee(list.get(0).getEmpId());
        System.out.println("Employee Deleted!");

        HibernateUtil.getSessionFactory().close();
    }
}

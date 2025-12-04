package com.demo.beans;

import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empId;

    @Column(nullable = false)
    private String empName;

    private double salary;

    // Many employees belong to ONE department
    @ManyToOne
    @JoinColumn(name = "dept_id")
    private Department department;

    public Employee() {}

    public Employee(String empName, double salary, Department department) {
        this.empName = empName;
        this.salary = salary;
        this.department = department;
    }

    // getters & setters
    public int getEmpId() { return empId; }
    public void setEmpId(int empId) { this.empId = empId; }
    public String getEmpName() { return empName; }
    public void setEmpName(String empName) { this.empName = empName; }
    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
    public Department getDepartment() { return department; }
    public void setDepartment(Department department) { this.department = department; }
}

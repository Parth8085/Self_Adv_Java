package com.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.demo.util.HibernateUtil;
import com.demo.beans.Employee;

public class EmployeeDao {

    public int addEmployee(Employee emp) {
        Transaction tx = null;
        int id = 0;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.beginTransaction();
            id = (int) session.save(emp);
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return id;
    }

    // HQL: List employees by department
    public List<Employee> getEmployeesByDeptId(int deptId) {
        List<Employee> list = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query<Employee> query = session.createQuery(
                    "FROM Employee e WHERE e.department.deptId = :deptId", Employee.class);
            query.setParameter("deptId", deptId);
            list = query.list();
        }
        return list;
    }

    // Delete employee
    public void deleteEmployee(int empId) {
        Transaction tx = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.beginTransaction();
            Employee emp = session.get(Employee.class, empId);
            if (emp != null) session.delete(emp);
            tx.commit();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

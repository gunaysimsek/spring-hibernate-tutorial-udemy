package com.luv2code.hibernate.demo;

import com.luv2code.hibernate.demo.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class EmployeeQueryDemo {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("employee_hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();


        try{
            session = factory.getCurrentSession();
            session.beginTransaction();
            List<Employee> employeeList = session
                    .createQuery("from Employee e where e.company = 'deloitte'")
                    .getResultList();
            for (Employee employee : employeeList) {
                System.out.println(employee);
            }
        }finally {
            factory.close();
        }

    }

}

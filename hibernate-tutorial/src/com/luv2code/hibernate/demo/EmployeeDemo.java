package com.luv2code.hibernate.demo;

import com.luv2code.hibernate.demo.entity.Employee;
import com.luv2code.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("employee_hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();


        try{

//            Employee employee1 = new Employee("gunay","simsek","deloitte");
//            Employee employee2 = new Employee("gunay","simsek","deloitte");
//            Employee employee3 = new Employee("gunay","simsek","deloitte");
//
//            List<Employee> employeeList = new ArrayList<>();
//            employeeList.add(employee1);
//            employeeList.add(employee2);
//            employeeList.add(employee3);
            Employee employee = new Employee("gunay","cimsek","ey");

            session.beginTransaction();
            session.save(employee);
//            for (Employee employee : employeeList) {
//                session.save(employee);
//
//            }
            session.getTransaction().commit();
            session = factory.getCurrentSession();
            session.beginTransaction();
            System.out.println("Getting student with id: " + employee.getId());
            Employee employee1 = session.get(Employee.class, employee.getId());
            System.out.println("Get complete: " + employee1);
            session.getTransaction().commit();


        }finally {
            factory.close();
        }
    }

}

package com.luv2code.hibernate.demo;

import com.luv2code.hibernate.demo.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class DeleteEmployeeDemo {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("employee_hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();


        try{
            int employeeId = 1;
            session = factory.getCurrentSession();
            session.beginTransaction();
            System.out.println("Getting employee with id: " + employeeId);
            Employee employee = session.get(Employee.class, employeeId);
            System.out.println("Deleting employee " + employee );
            session.delete(employee);

            session.getTransaction().commit();
            session = factory.getCurrentSession();
            session.beginTransaction();
            System.out.println("Deleting employee with id = 2");
            session.createQuery("delete from Employee where id = 2").executeUpdate();

            List<Employee> employeeList = session
                    .createQuery("from Employee")
                    .getResultList();
            for (Employee employeea : employeeList) {
                System.out.println(employeea);
            }
            session.getTransaction().commit();


        }finally {
            factory.close();
        }
    }
}

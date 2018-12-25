package com.luv2code.hibernate.demo;

import com.luv2code.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateStudentDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();


        try{
            int studentId = 1;

            session = factory.getCurrentSession();
            session.beginTransaction();
            Student student = session.get(Student.class, studentId);
            System.out.println("Updating student");
            student.setFirstName("gunay");
            session.getTransaction().commit();

            session = factory.getCurrentSession();
            session.beginTransaction();

            System.out.println("Update all emails");
            session.createQuery("update Student set email = 'foo@gmail.com'").executeUpdate();
            session.getTransaction().commit();
        }finally {
            factory.close();
        }
    }
}

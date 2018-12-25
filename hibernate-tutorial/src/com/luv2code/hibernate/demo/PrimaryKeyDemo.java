package com.luv2code.hibernate.demo;

import com.luv2code.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PrimaryKeyDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();


        try{
            Student student1 = new Student("Paul1", "Wall1", "paul1@gmail.com");
            Student student2 = new Student("Paul2", "Wall2", "paul2@gmail.com");
            Student student3 = new Student("Paul3", "Wall3", "paul3@gmail.com");

            session.beginTransaction();
            session.save(student1);
            session.save(student2);
            session.save(student3);
            session.getTransaction().commit();

        }finally {
            factory.close();
        }
    }
}

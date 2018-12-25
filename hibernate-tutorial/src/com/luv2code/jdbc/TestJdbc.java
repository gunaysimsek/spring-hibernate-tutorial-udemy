package com.luv2code.jdbc;

import com.luv2code.hibernate.demo.entity.Employee;
import com.luv2code.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

    public static void main(String[] args){
//       String url = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false&serverTimezone=UTC";
//
//       String user = "hbstudent";
//       String pw = "hbstudent";
//
//        try{
//            System.out.println("Connecting to database " + url );
//            Connection conn = DriverManager.getConnection(url,user,pw);
//            System.out.println("Connection successful!");
//
//
//       }catch (Exception e){
//            e.printStackTrace();
//        }
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();
        try{
            Student student = new Student("Paul", "Wall", "paul@gmail.com");
            session.beginTransaction();
            session.save(student);
            session.getTransaction().commit();
        }finally {
            factory.close();
        }

    }
}

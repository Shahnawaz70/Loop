package com.kodenst.hibernateSixth;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {
    public static void main(String[] args) {
    	Course course1 = new Course("Java");
    	Course course2 = new Course("Sql");
    	Course course3 = new Course("DSA");
    	
    	KodnestStudent kodnestStudent = new KodnestStudent("Alam","alam@gmail.com","7070971305");
    	course1.setKodnestStudent(kodnestStudent);
    	course2.setKodnestStudent(kodnestStudent);
    	course3.setKodnestStudent(kodnestStudent);
    	
    	List<Course> courseList = new ArrayList<Course>();
    	courseList.add(course1);
    	courseList.add(course2);
    	courseList.add(course3);
    	
    	kodnestStudent.setCourses(courseList);
    			
        SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(kodnestStudent);
        transaction.commit();
        session.close();
        sf.close();
    }
}

package com.kodenst.TenthHibernate_HQL;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {
    public static void main(String[] args) {
       SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
       Session session = factory.openSession();
       Transaction transaction = session.beginTransaction();
       String hql = "from Student where id > 7";
       Query<Student> query = session.createQuery(hql, Student.class);
       List<Student> studentList = query.getResultList();
//       System.out.println(studentList);
       for(Student x: studentList) {
    	   System.out.println(x);
       }
       transaction.commit();
       session.close();
       factory.close();
    }
}

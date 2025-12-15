package com.kodenst.hibernateFifth;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter Book name, price, noOfPages");
       Book book = new Book(sc.next(), sc.nextInt(), sc.nextInt());
       
       System.out.println("Enter Author name, gender, age, address");
       Author author = new Author(sc.next(), sc.next(), sc.nextInt(), sc.next());
 
	   author.setBook(book);
	   
	   SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	   Session session = sf.openSession();
	   Transaction transaction = session.beginTransaction();
	   session.persist(author);
	   transaction.commit();
	   session.close();
	   sf.close();
	   sc.close();
	   
    }
}

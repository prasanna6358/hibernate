package com.peddi.webserv;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App
{
    public static void main( String[] args ) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Address address = new Address();
        address.setAddressId(103);
        address.setLocation("Japan");

        Students students = new Students();
        students.setAddress(address);
        students.setStudentId(3);
        students.setStudentName("Sriram");

        session.save(students);

        transaction.commit();

        session.clear();
        session.close();
        System.out.println("One to One with annotations is done..!!!!");
        sessionFactory.close();
    }
}

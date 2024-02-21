package com.testHibernate.HibernateTest;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
        Configuration cf= new Configuration();
        cf.configure("hibernate.cfg.xml");
        cf.addAnnotatedClass(Laptop.class);
        
        SessionFactory sf = cf.buildSessionFactory();
        Session s1=sf.openSession();
        
        Laptop l1=new Laptop();
        l1.setId(3);
        l1.setBrand("Acer");
        l1.setPrice(70000);
        
        s1.beginTransaction();
        s1.save(l1);
        s1.getTransaction().commit();
        s1.close();
        System.out.println("One data saved in laptop table in 'hibernateTest' Database");
    }
}

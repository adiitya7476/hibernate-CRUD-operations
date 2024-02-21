package com.testHibernate.HibernateTest;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

public class Retrieve {
	public static void main(String[] args) {
		Configuration cf= new Configuration();
		cf.configure("hibernate.cfg.xml");
		cf.addAnnotatedClass(Laptop.class);
		
		SessionFactory sf=cf.buildSessionFactory();
		Session session=sf.openSession();
		
		Laptop l=session.get(Laptop.class, 2);
		System.out.println("Id = "+l.getId());
		System.out.println("Brand = "+l.getBrand());
		System.out.println("Price = "+l.getPrice());
		
		session.close();
		sf.close();
		
	}
}

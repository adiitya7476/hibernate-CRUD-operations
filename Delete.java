package com.testHibernate.HibernateTest;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

public class Delete {
	public static void main(String[] args) {
		Configuration cf=new Configuration();
		cf.configure("hibernate.cfg.xml");
		cf.addAnnotatedClass(Laptop.class);
		
		SessionFactory sf=cf.buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		
		Laptop l=session.get(Laptop.class, 3);
		session.delete(l);
		t.commit();
		session.close();
		sf.close();
		System.out.println("Data deleted from DB");
		
	}
}

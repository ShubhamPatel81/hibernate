package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	System.out.println("Hello World!");
//		Student stu = new Student( 21, "mail", "banglore", "2222220");
//		Configuration cfg = new Configuration();
//		cfg.configure("hibernate.cfg.xml");
//		SessionFactory factory = cfg.buildSessionFactory();
//		Session session = factory.openSession();
//		Transaction ts = session.beginTransaction();
//		session.save(stu);
//		ts.commit();
//		session.close();
//		System.out.println("Record Save Successfully!!!");
        
    	
//  	SessionFactory factory=  HibernateUtil.getSessionFactory();
  //     System.out.println(factory);
    	
    	
    	
    	// For Employeee 
    	System.out.println("Hello World!");
		Employee emp = new Employee( );
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction ts = session.beginTransaction();
		session.save(emp  );
		ts.commit();
		session.close();
		System.out.println("Record Save Successfully!!!");
       
    }
}

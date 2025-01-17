package com.hibernate.CurdOperation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    		Session session = sessionFactory.openSession();
    		
    		Student st = new Student();
    		st.setName("shubh");
    		st.setAddress("banglore");
    		st.setCollege("jain");
    		st.setEmail("jain@gmail.com");
    		
    		Student st2 = new Student();
    		st2.setName("shubh2");
    		st2.setAddress("banglore2");
    		st2.setCollege("jain2");
    		st2.setEmail("jain2@gmail.com");

    		Transaction tx = session.beginTransaction();
    		
    		session.save(st);
    		session.save(st2);
    		
    		tx.commit();
    		
    		System.out.println("Student Register Successfully !! ");
    		session.close();
    		sessionFactory.close();
    	
    }
}

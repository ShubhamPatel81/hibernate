package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class FetchApp {
public static void main(String[] args) {
	SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
	Session session = sessionFactory.openSession();
	Employee emp = session.get(Employee.class, 1);
	Employee emp1 = session.load(Employee.class, 1);
	System.out.println(emp );
	System.out.println(emp1);
}
	
	}

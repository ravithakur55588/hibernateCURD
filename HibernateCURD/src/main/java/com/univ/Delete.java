package com.univ;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Delete {
public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory factory = cfg.buildSessionFactory();
		System.out.println(factory);
		
		Session s = factory.openSession();
	    Transaction tx = s.beginTransaction();
	    
	    //HQL Query
	    Query q = s.createQuery("delete from Car c where c.id = : m ");
	    
	    //putting value in m
	    q.setParameter("m", 101);
	    
	    q.executeUpdate();
	    System.out.println("Item deleted");
	     
		tx.commit();
		s.close();
		factory.close();
		System.out.println("Prog end....");
	}
}

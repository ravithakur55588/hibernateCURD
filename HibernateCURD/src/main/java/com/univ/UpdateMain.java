package com.univ;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class UpdateMain {
public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory factory = cfg.buildSessionFactory();
		System.out.println(factory);
		
		Session s = factory.openSession();
	    Transaction tx = s.beginTransaction();
	    
	    //HQL Query
	    
	    Query q = s.createQuery("update Car c set c.carmodel = : m , c.carprice = : o where c.id = : n");
	    
	    //putting value in m,n,0
	    q.setParameter("m", "xxxxx");
	    q.setParameter("n", 101);
	    q.setParameter("o", "4258619");
	    
	    q.executeUpdate();
	    System.out.println("Item updated");
	     
		tx.commit();
		s.close();
		factory.close();
		System.out.println("Prog end....");
	}
}

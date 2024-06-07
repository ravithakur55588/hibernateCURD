//insert data program
package com.univ;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertMain 
{
    public static void main( String[] args )
    {
        System.out.println( "Prog Start......" );
        
        Configuration cfg = new Configuration();
        cfg.configure();
        
        SessionFactory factory = cfg.buildSessionFactory();
        System.out.println("Session factory object created");
        
        Session s = factory.openSession();
        Transaction tx = s.beginTransaction();
        
        Car c1 = new Car();
        c1.setCarid(2111);
        c1.setCarname("train");
        c1.setCarmodel("th121");
        c1.setCarprice("8000000");
        
        s.save(c1);
        
        tx.commit();
        s.close();
        factory.close();
        System.out.println("prog end........");
        
    }
}

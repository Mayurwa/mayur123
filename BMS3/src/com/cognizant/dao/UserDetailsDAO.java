package com.cognizant.dao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.cognizant.entity.User;

public class UserDetailsDAO {
	SessionFactory sessionFactory =new AnnotationConfiguration().configure().addAnnotatedClass(User.class).buildSessionFactory();
	
	public void addUser(User u){
		Session session= sessionFactory.openSession();
		Transaction t= session.beginTransaction();
		session.save(u);
		t.commit();
		session.close();
		
	}
}

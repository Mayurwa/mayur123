package com.cognizant.dao;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import com.cognizant.entity.TransactionDetails;
public class TransactionDetailsDAO {
	SessionFactory sessionFactory = new AnnotationConfiguration().configure().
            addAnnotatedClass(TransactionDetails.class).buildSessionFactory();
	
	public void addTransactionDetails(TransactionDetails td) {
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();	
		session.save(td);
		t.commit();
		session.close();
		}
	
	public void getjoin() {
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();	
		Query query = session.createQuery("select TRANSACTION_TYPE from TRANSACTION_DETAILS td join USER_DETAILS ud where ud.ACCOUNT_NUMBER=td.ACCOUNT_NUMBER ");
		System.out.println(query);
//		query.exe
		t.commit();
		session.close();
		
	}
	
}
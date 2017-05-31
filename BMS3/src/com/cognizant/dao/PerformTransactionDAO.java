package com.cognizant.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Component;

import com.cognizant.entity.User;
import com.cognizant.vo.TransactionDetailsVO;

@Component
public class PerformTransactionDAO {
	 @PersistenceContext
	  private EntityManager em;
	 	
	
	public User updateTransactionDetails(Long accountNumber) {
		User user=em.find(User.class,accountNumber );
		System.out.println("dao user :"+user);
		return user;
		}
	/*@Transactional
	public String getAccountHolderName(Long accountNumber) {
		Query query = em.createQuery("select account_holder_name from mock_data e where e.account_number= ?");
		query.setParameter(1, accountNumber);
		String userName=(String) query.getSingleResult();
		return userName;
		
	}*/

	public List<TransactionDetailsVO> retrieveTransactionDetails(Long accountNumber) {
		User user=em.find(User.class, accountNumber);
		System.out.println(user);
		System.out.println(user.getTdDetails());
		List<TransactionDetailsVO> transaction=user.getTdDetails();
		return transaction; 
		
	}

}

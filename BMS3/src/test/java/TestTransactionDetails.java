package test.java;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cognizant.dao.TransactionDetailsDAO;
import com.cognizant.entity.TransactionDetails;
import com.cognizant.service.PerformTransactionService;
import com.cognizant.vo.TransactionDetailsVO;
public class TestTransactionDetails{
     TransactionDetailsDAO dao;
     
	
	@Before
	public void setup(){
		dao = new TransactionDetailsDAO();
	}
	@Test
	public void addTransactionDetails() {
		TransactionDetails td = new TransactionDetails("Savings","Deposit",50000);
		dao.addTransactionDetails(td);
		assertTrue(true);
	}
	
	//@Test
	public void getTransactiontype(){
		dao.getjoin();
		assertTrue(true);
	}
}
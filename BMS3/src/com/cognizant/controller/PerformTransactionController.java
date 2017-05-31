package com.cognizant.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cognizant.entity.User;
import com.cognizant.service.PerformTransactionService;
import com.cognizant.vo.TransactionDetailsVO;

@Controller
public class PerformTransactionController {
	
	@Autowired
	 PerformTransactionService service;
	private List<TransactionDetailsVO> transactionDetailsList;
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public String initiateTransaction (@RequestParam("accountNumber") Long accountNumber,
			@RequestParam("transactionType")String transactionType,@RequestParam("transactionAmount") Long transactionAmount, @RequestParam("description")String description, Model model){
		
		String userName=getAccountHolderName(accountNumber);
		
		transactionDetailsList = new ArrayList<TransactionDetailsVO>();	
		
		TransactionDetailsVO transactionDetail = new TransactionDetailsVO(description,transactionType,accountBalance,User user);
		transactionDetailsList.add(transactionDetail);
		
		try {
			service.updateTransactionDetails(transactionDetailsList);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "member";
	}

	private String getAccountHolderName(Long accountNumber) {
		
		String userName=service.getAccountHolderName(accountNumber);
		
		return userName;
	}
}

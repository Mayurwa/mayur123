package com.cognizant.vo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.cognizant.entity.User;

@Entity
public class TransactionDetailsVO {
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="TRANSACTION_ID")
	long transactionId=(long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;;

	@Column(name="TRANSACTION_DESCRIPTION")
	String transactionDescription;
	
	@Column(name="TRANSACTION_TYPE")
	String transactionType;
	
	@Column(name="TRANSACTION_AMOUNT")
	int transactionAmount;
	
	@ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name="ACCOUNT_NUMBER")
		private User user;

	public Long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}


	public String getTransactionDescription() {
		return transactionDescription;
	}

	public void setTransactionDescription(String transactionDescription) {
		this.transactionDescription = transactionDescription;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public int getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(int accountBalance) {
		this.transactionAmount = accountBalance;
	}
	
	

	@Override
	public String toString() {
		return "TransactionDetailsVO [transactionId=" + transactionId 
				+ ", transactionDescription=" + transactionDescription + ", transactionType=" + transactionType
				+ ", transactionAmount=" + transactionAmount + "]";
	}
	
	public TransactionDetailsVO(){
		
	}
	
	

	public TransactionDetailsVO(String transactionDescription, String transactionType, int transactionAmount) {
		super();
		this.transactionDescription = transactionDescription;
		this.transactionType = transactionType;
		this.transactionAmount = transactionAmount;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	}

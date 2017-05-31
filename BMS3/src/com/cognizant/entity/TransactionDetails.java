package com.cognizant.entity;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="TRANSACTION_DETAILS")
public class TransactionDetails {
	@Id
	@Column(name="TRANSACTION_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	int transactionId;
	
	//@Column(name="ACCOUNT_NUMBER")
	//int accountNumber;
	
	@Column(name="TRANSACTION_DESCRIPTION")
	String transactionDescription;
	
	@Column(name="TRANSACTION_TYPE")
	String transactionType;
	
	@Column(name="ACCOUNT_BALANCE")
	int accountBalance;
	
	@ManyToOne
	@JoinColumn(name = "ACCOUNT_NUMBER")
	private User users;
	
	
	public TransactionDetails(){
		
	}
	
	public TransactionDetails(String transactionDescription,
			String transactionType, int accountBalance) {
		super();
		//this.accountNumber = accountNumber;
		this.transactionDescription = transactionDescription;
		this.transactionType = transactionType;
		this.accountBalance = accountBalance;
	}
	
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
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
	public int getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	@Override
	public String toString() {
		return "TransactionDetails [transactionId=" + transactionId + 
				", transactionDescription=" + transactionDescription + ", transactionType=" + transactionType
				+ ", accountBalance=" + accountBalance + "]";
	}
}
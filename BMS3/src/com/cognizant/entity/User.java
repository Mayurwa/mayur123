package com.cognizant.entity;

import com.cognizant.vo.TransactionDetailsVO;

import java.util.List;
import javax.persistence.*;



@Entity
@Table(name="USER_DETAILS")
public class User {
	@Id
	@Column(name="Account_Number",length=16)
	//@Type(type="number")
	long accountNumber;
	
	@Column(name="ACCOUNT_TYPE",length=20)
	//@Type(type="text")
	String accountType;
	
	@Column(name="ACCOUNT_HOLDER_NAME",length=20)
	//@Type(type="text")
	String acountHolderName;
	
	
	
	@Column(name="ACCOUNT_BALANCE",length=20)
	//@Type(type="number")
	int accountBalance;
	
	
    
	
	
	
	public User(){}
	
	public User(long accountNumber, String accountType, String acountHolderName, int accountBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.acountHolderName = acountHolderName;
		this.accountBalance = accountBalance;
	}

	@Override
	public String toString() {
		return "User [accountNumber=" + accountNumber + ", accountType=" + accountType + ", acountHolderName="
				+ acountHolderName + ", accountBalance=" + accountBalance + "]";
	}
	
	@OneToMany(mappedBy = "user",cascade =CascadeType.ALL)
	private List<TransactionDetailsVO> tdDetails;
	
	public List<TransactionDetailsVO> getTdDetails() {
		return tdDetails;
	}

	public void setTdDetails(List<TransactionDetailsVO> tdDetails) {
		this.tdDetails = tdDetails;
	}

	@OneToMany(cascade =CascadeType.ALL,fetch=FetchType.EAGER)
	//@JoinColumn(name="ACCOUNT_NUMBER")
	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAcountHolderName() {
		return acountHolderName;
	}

	public void setAcountHolderName(String acountHolderName) {
		this.acountHolderName = acountHolderName;
	}

	public int getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	
	 
}

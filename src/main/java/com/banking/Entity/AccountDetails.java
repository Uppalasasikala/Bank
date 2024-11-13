package com.banking.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="account_info")
public class AccountDetails {
	@Id
	@Column
	  Long account_number;
	@Column
      String account_name;
	@Column
      Double balance;
	public AccountDetails(Long account_number, String account_name, Double balance) {
		
		this.account_number = account_number;
		this.account_name = account_name;
		this.balance = balance;
	}
	AccountDetails()
	{
		
	}
	public Long getAccount_number() {
		return account_number;
	}
	public void setAccount_number(Long account_number) {
		this.account_number = account_number;
	}
	public String getAccount_name() {
		return account_name;
	}
	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
}

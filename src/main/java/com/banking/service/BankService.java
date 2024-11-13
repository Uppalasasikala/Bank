package com.banking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.Entity.AccountDetails;
import com.banking.Repo.BankRepo;
@Service
public class BankService {
	@Autowired
	BankRepo repo;
	
	public AccountDetails insertDetail(AccountDetails info) {
		return repo.save(info);
	}
	

}

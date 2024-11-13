package com.banking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.banking.Entity.AccountDetails;
import com.banking.service.BankService;

@RestController
public class BankController {
	@Autowired
	BankService service;
	@PostMapping(value="/insert")
	public String insertDetail(@RequestBody AccountDetails info) {
		AccountDetails detail = service.insertDetail(info);
		return "record inserted with id -->" + info.getAccount_number();
	}

}

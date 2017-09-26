package com.citibank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.citibank.model.Account;
import com.citibank.service.accountServiceImpl;

@RestController
public class AccountController {
	
	private final accountServiceImpl accountService;

	@Autowired
	public AccountController(accountServiceImpl accountService) {
		this.accountService = accountService;
	}

	@RequestMapping(value = "/getDiscount", method = RequestMethod.GET, produces = "application/json")
	public Account getQuestions(@RequestParam(required = true) String type) {

		Account account = new Account();
		account.setType(type);
		accountService.getProductDiscount(account);
		return account;
	}

}

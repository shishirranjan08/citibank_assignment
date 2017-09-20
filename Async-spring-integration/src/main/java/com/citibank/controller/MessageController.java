package com.citibank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.citibank.domain.Account;
import com.citibank.service.MessageServiceImpl;

@RestController
public class MessageController {
	
	
	@Autowired
	private MessageServiceImpl service;
	
	@PostMapping("/send")
	public String postMessage(@RequestBody Account[] accounts) {
		
		return service.postMessage(accounts);
	}

	
}

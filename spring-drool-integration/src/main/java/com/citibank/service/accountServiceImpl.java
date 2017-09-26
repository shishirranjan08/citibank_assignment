package com.citibank.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citibank.model.Account;

@Service
public class accountServiceImpl {

	private final KieContainer kieContainer;

	@Autowired
	public accountServiceImpl(KieContainer kieContainer) {
		this.kieContainer = kieContainer;
	}

	public Account getProductDiscount(Account account) {
		//get the stateful session
		KieSession kieSession = kieContainer.newKieSession("rulesSession");
		kieSession.insert(account);
		kieSession.fireAllRules();
		kieSession.dispose();
		return account;
	}
}

package com.citibank.integration.filter;

import org.springframework.integration.annotation.Filter;
import org.springframework.integration.annotation.MessageEndpoint;

import com.citibank.domain.Account;

@MessageEndpoint
public class AccountFilter {
	
	@Filter(inputChannel="gatewayChannel", outputChannel="messageServiceChannel")
	public boolean filter(Account account) {
		boolean flag=account.getAccountNumber() > 0;
		System.out.println("Message filtering status : " + flag);
		return flag;
	}

}

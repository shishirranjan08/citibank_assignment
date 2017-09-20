package com.citibank.service;

import com.citibank.domain.Account;

public class MessageProcessingService {
	
	public String processMessage(Account account) throws Exception{
		
		System.out.println(Thread.currentThread().getName());
		//TODO: Message processing logic
		return "Message processed successfully";
	}

}

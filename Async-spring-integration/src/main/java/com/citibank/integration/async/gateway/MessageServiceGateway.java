package com.citibank.integration.async.gateway;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.util.concurrent.ListenableFuture;

import com.citibank.domain.Account;

@MessagingGateway(defaultReplyTimeout = "0", asyncExecutor = "exec")
public interface MessageServiceGateway {
	
	@Gateway(requestChannel = "gatewayChannel")
	ListenableFuture<String> postMessage(Account account);

}

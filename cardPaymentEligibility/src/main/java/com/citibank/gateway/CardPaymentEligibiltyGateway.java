package com.citibank.gateway;

import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.messaging.handler.annotation.Payload;

@MessagingGateway(name = "entrygateway", defaultRequestChannel = "requestChannel",defaultReplyChannel = "responseChannel")
public interface CardPaymentEligibiltyGateway {

	@Payload("new java.util.Date()")
	public String getEligibility();
}

package com.citibank.integration.endpoints;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CardPaymentEligibilityIntegrator {
	
	@ServiceActivator(inputChannel="requestChannel",outputChannel="responseChannel")
	public String mergeResponse() {
		
		RestTemplate template = new RestTemplate();
		String accounts = template.getForObject("http://localhost:8090/v1/accounts", String.class);
		String payee = template.getForObject("http://localhost:8091/v1/moneyMovements/payees", String.class);
		return accounts+" " + payee;
	}
}

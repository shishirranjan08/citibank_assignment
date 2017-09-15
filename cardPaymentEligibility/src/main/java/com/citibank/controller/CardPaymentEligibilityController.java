package com.citibank.controller;


import javax.xml.ws.RespectBinding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.citibank.gateway.CardPaymentEligibiltyGateway;


@RestController
public class CardPaymentEligibilityController {


@Autowired
private CardPaymentEligibiltyGateway gateway;

@RequestMapping("/DomesticCardPaymentsSourceAccountEligibility")
public String getEligibility() {
	return gateway.getEligibility();
}
	
}

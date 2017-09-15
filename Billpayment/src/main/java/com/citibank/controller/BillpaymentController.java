package com.citibank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.citibank.service.BillPaymentService;
import com.citibank.service.BillPaymentServiceImpl;

@RestController("/")
public class BillpaymentController {

	@Autowired
	private BillPaymentService billPaymentService;
	
	
	@RequestMapping(value = "/payment/{paymentoptions}")
	public String Response(@PathVariable("paymentoptions") String options){
		String temp =  billPaymentService.PaymentService(options);
		System.out.println("temp ....." + temp);
		return temp;
		
		
		
	}
	
	
}

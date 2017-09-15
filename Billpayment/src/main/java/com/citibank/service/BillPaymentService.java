package com.citibank.service;

public interface BillPaymentService {
	
	public String StandingInstructionAdd();
	
	public String FundTransferAndPaymentPost();
	
	public String AddPayee(String Name);
	
	public String PaymentService(String paymentoptions);

}

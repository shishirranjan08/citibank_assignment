package com.citibank.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class BillPaymentServiceImpl implements BillPaymentService{
	

	public String StandingInstructionAdd() {
		return "Standing Instructions added";
	
	}
	
	public String FundTransferAndPaymentPost() {
		return "Fund Transfer Done";
	}
	
	public String AddPayee(String Name) {
		
		return Name + "" + "Payee Added Successfully";
	}
	
	public String PaymentService(String paymentoption) {
		
		String Temp = null;
		if (paymentoption.equals("FUTURE_DATED"))
			Temp = StandingInstructionAdd();
		if (paymentoption.equals("IMMEDIATE"))
			Temp = FundTransferAndPaymentPost();
		if (paymentoption.equals("BILLER_ENROLLMENT"))
			Temp = AddPayee("Shishir");
		return Temp;
	}
}


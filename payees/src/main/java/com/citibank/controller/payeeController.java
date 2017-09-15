package com.citibank.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class payeeController {
	@RequestMapping("/v1/moneyMovements/payees")
	public String getPayee() {
		return "{\r\n" + 
				"  \"VDP-Amazon *Mktplc\": {\r\n" + 
				"    \"payee\": \"Amazon Marketplace\",\r\n" + 
				"    \"category\": \"Everyday Expenses: Amazon\"\r\n" + 
				"  },\r\n" + 
				"  \"VDA-\": {\r\n" + 
				"    \"payee\": \"Transfer: Cash\",\r\n" + 
				"    \"category\": \"\"\r\n" + 
				"  },\r\n" + 
				"  \"D/D BORD GAIS EIRE\": {\r\n" + 
				"    \"payee\": \"Bord Gais\",\r\n" + 
				"    \"category\": \"Monthly Bills: Gas and Electricity\"\r\n" + 
				"  }\r\n" + 
				"} ";
	}

}

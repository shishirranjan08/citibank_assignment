package com.citibank.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
	
	@RequestMapping("/v1/accounts")
	public String getAccounts() {
		//TODO : get original response from client and return
		return "{\r\n" + 
				"      \"Name\" : \"Xytrex Co.\",\r\n" + 
				"\r\n" + 
				"      \"Description\" : \"Industrial Cleaning Supply Company\",\r\n" + 
				"\r\n" + 
				"      \"Account Number\" : \"ABC15797531\"\r\n" + 
				"\r\n" + 
				"   }\r\n" + 
				"\r\n" + 
				"   {\r\n" + 
				"\r\n" + 
				"      \"Name\" : \"Watson and Powell, Inc.\",\r\n" + 
				"\r\n" + 
				"      \"Description\" : \"Law firm. New York Headquarters\",\r\n" + 
				"\r\n" + 
				"      \"Account Number\" : \"ABC24689753\"    \r\n" + 
				"\r\n" + 
				"   }";
		
			 

	}
	

}

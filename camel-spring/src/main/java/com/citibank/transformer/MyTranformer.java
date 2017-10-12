package com.citibank.transformer;

public class MyTranformer {
	
	public String TransformContent(String body) {
		String uppercaseContent = body.toUpperCase();
		return uppercaseContent;
	}

}

package com.citibank.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component
public class MyProcessor implements Processor {

	 @Override
	 public void process(Exchange exchange) throws Exception {
	        System.out.println("Now Processing the string :" +exchange.getIn().getBody(String.class));
	    }
}

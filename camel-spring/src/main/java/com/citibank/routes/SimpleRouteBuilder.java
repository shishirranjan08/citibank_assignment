package com.citibank.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import com.citibank.processor.MyProcessor;
import com.citibank.transformer.MyTranformer;

//@Component
public class SimpleRouteBuilder extends RouteBuilder{
	
	@Override
	public void configure() throws Exception {
        from("file:C:/inputFolder?noop=true").process(new MyProcessor()).bean(new MyTranformer(),"TransformContent").to("file:C:/outputFolder");
    }
	
	

}

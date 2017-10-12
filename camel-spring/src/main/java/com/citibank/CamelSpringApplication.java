package com.citibank;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.citibank.routes.SimpleRouteBuilder;

@SpringBootApplication
public class CamelSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CamelSpringApplication.class, args);

		System.out.println("Application context started");
		
	
		SimpleRouteBuilder routeBuilder = new SimpleRouteBuilder();

		
		CamelContext ctx = new DefaultCamelContext();
	

		CamelSpringApplication app = new CamelSpringApplication();
		try {
			ctx.addRoutes(routeBuilder);
			ctx.start();
			Thread.sleep(5 * 60 * 1000);
			ctx.stop();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
}

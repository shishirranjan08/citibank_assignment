package com.citibank;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.citibank.routes.SimpleRouteBuilder;

@SpringBootApplication
@RestController
public class CamelSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CamelSpringApplication.class, args);

		System.out.println("Application context started");

		/*
		 * SimpleRouteBuilder routeBuilder = new SimpleRouteBuilder();
		 * 
		 * 
		 * CamelContext ctx = new DefaultCamelContext();
		 * 
		 * 
		 * CamelSpringApplication app = new CamelSpringApplication(); try {
		 * ctx.addRoutes(routeBuilder); ctx.start(); Thread.sleep(5 * 60 * 1000);
		 * ctx.stop(); } catch (Exception e) { e.printStackTrace(); }
		 */
	}

	@Autowired
	CamelContext ctx;

	//@Autowired
	//SimpleRouteBuilder routeBuilder;

	@RequestMapping("/start")
	public String startCamel() {
		try {
			ctx.addRoutes(new SimpleRouteBuilder());
			ctx.start();
			Thread.sleep(5 *  1000);
			ctx.stop();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "success";
	}

}

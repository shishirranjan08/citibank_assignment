package com.citibank.integration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.messaging.MessageChannel;

@Configuration
@ComponentScan("com.citibank.integration.endpoints")
@IntegrationComponentScan("com.citibank.gateway")
@EnableIntegration

public class IntegrationConfig {
	
	@Bean
	@Description("Entry to the messaging system through the gateway")
	public MessageChannel requestChannel() {
		return new DirectChannel();
	}
	
	@Bean
	@Description("Entry to the messaging system through the gateway ")
	public MessageChannel responseChannel() {
		return new DirectChannel();
	}

}

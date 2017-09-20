package com.citibank.integration.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.AsyncTaskExecutor;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.messaging.MessageChannel;

import com.citibank.service.MessageProcessingService;


@Configuration
@ComponentScan
@EnableIntegration
@IntegrationComponentScan
public class IntegrationConfig {
	
	@Bean
	public MessageChannel gatewayChannel() {
		return new DirectChannel();
	}

	@Bean
	@ServiceActivator(inputChannel="messageServiceChannel")
	public MessageProcessingService messageService() {
		return new MessageProcessingService();
	}

	@Bean
	public AsyncTaskExecutor exec() {
		SimpleAsyncTaskExecutor simpleAsyncTaskExecutor = new SimpleAsyncTaskExecutor();
		simpleAsyncTaskExecutor.setThreadNamePrefix("exec-");
		return simpleAsyncTaskExecutor;
	}

}





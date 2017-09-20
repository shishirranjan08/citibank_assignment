package com.citibank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

import com.citibank.domain.Account;
import com.citibank.integration.async.gateway.MessageServiceGateway;

@Service
public class MessageServiceImpl {

	@Autowired
	private MessageServiceGateway gateway;

	public String postMessage(Account[] accounts) {

		for (Account account : accounts) {
			ListenableFuture<String> result = gateway.postMessage(account);
			ListenableFutureCallback<String> callback = new ListenableFutureCallback<String>() {

				@Override
				public void onSuccess(String result) {
					System.out.println("Message processed successfully : " + result);
				}

				@Override
				public void onFailure(Throwable t) {
					System.err.println("Unexpected exception ");

				}
			};
			result.addCallback(callback);
		}
		return "successfully posted messages";
	}

}

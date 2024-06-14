package com.springboot.rest.api.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.springboot.rest.api.dto.PaymentDataDto;

@Service
public class OrdersService {
	public String makePaymentForOrder(String amount) {

		String url = "http://localhost:9292/payment/netbanking/pay";

		PaymentDataDto paymentData = new PaymentDataDto("silar_shaik","silar456",Double.parseDouble(amount));

		// by default spring Supporting
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<PaymentDataDto> httpEntity = new HttpEntity<PaymentDataDto>(paymentData, headers);

		System.out.println("sending request to payment application");

		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, httpEntity, String.class);

		String responseBody = response.getBody();
		HttpHeaders httpHeaders = response.getHeaders();
		HttpStatusCode code = response.getStatusCode();
		return responseBody;
	}

}

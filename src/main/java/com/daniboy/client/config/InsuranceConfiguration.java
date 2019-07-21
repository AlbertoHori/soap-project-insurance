package com.daniboy.client.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import com.daniboy.client.gateway_service.InsuranceClient;

@Configuration
public class InsuranceConfiguration {
	
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
		jaxb2Marshaller.setContextPath("com.daniboy.spring_ws_app");
		return jaxb2Marshaller;
	}
	
	@Bean
	public InsuranceClient insuranceClient(Jaxb2Marshaller marshaller) {	
		InsuranceClient insuranceClient = new InsuranceClient();
		insuranceClient.setDefaultUri("http://localhost:8080/ws/insuranceService");
		insuranceClient.setMarshaller(marshaller);
		insuranceClient.setUnmarshaller(marshaller);
		
		return insuranceClient;
	}
}

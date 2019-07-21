package com.daniboy.client.gateway_service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.daniboy.spring_ws_app.InsuranceRequest;
import com.daniboy.spring_ws_app.InsuranceResponse;

public class InsuranceClient extends WebServiceGatewaySupport {

	private static final Logger logger = LoggerFactory.getLogger(InsuranceClient.class);

	public InsuranceResponse getInsurance(InsuranceRequest insuranceRequest) {

		/*
		 * <spr:Applicant> <spr:SSN>12-34-5522</spr:SSN>
		 * <spr:FirstName>Samantha</spr:FirstName>
		 * <spr:MiddleName>Sting</spr:MiddleName> <spr:LastName>Bee</spr:LastName>
		 * </spr:Applicant>
		 * 
		 * <spr:InsuranceInfo> <spr:product>Widget Protector</spr:product>
		 * <spr:coverageType>Full Life</spr:coverageType>
		 * <spr:coverageOption>Gold</spr:coverageOption> </spr:InsuranceInfo>
		 * 
		 * <spr:WidgetInfo> <spr:wgtAmount>560.00</spr:wgtAmount>
		 * <spr:wgtContractNumber>76.00</spr:wgtContractNumber> </spr:WidgetInfo>
		 */

		logger.info("Requesting insurance for :" + insuranceRequest);

		InsuranceResponse insuranceResponse = (InsuranceResponse) getWebServiceTemplate().marshalSendAndReceive(
				"http://localhost:8080/ws", insuranceRequest,
				new SoapActionCallback("http://localhost:8080/ws/insuranceService"));

		return insuranceResponse;
	}
}

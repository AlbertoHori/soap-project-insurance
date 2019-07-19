package com.daniboy.endpoints;

import com.daniboy.service.InsuranceService;
import com.daniboy.spring_ws_app.InsuranceRequest;
import com.daniboy.spring_ws_app.InsuranceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class InsuranceWSEndpoint {

    private static final String NAMESPACE_URI = "http://www.daniboy.com/spring_ws_app";

    private InsuranceService insuranceService;

    @Autowired
    public InsuranceWSEndpoint(InsuranceService insuranceService) {
        this.insuranceService = insuranceService;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "InsuranceRequest")
    @ResponsePayload
    public InsuranceResponse InsuranceApplication(@RequestPayload InsuranceRequest insuranceApplicationRequest) throws Exception {
        if (insuranceApplicationRequest != null) {
        	//Imprime o seguro recebido
            insuranceService.writeInsuranceApplication(insuranceApplicationRequest);
        }
        //Persiste o seguro via hardcode
        return insuranceService.processInsuranceApplication(insuranceApplicationRequest);
    }
}

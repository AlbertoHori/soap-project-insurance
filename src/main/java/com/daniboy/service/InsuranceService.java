package com.daniboy.service;

import com.daniboy.spring_ws_app.InsuranceRequest;
import com.daniboy.spring_ws_app.InsuranceResponse;

public interface InsuranceService {

    void writeInsuranceApplication(InsuranceRequest insuranceRequest);

    InsuranceResponse processInsuranceApplication(InsuranceRequest insuranceRequest);
}

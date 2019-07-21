package com.daniboy.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.daniboy.client.gateway_service.InsuranceClient;
import com.daniboy.spring_ws_app.InsuranceRequest;
import com.daniboy.spring_ws_app.InsuranceResponse;

@Controller
public class HomeController {

	@Autowired
	private InsuranceClient insuranceClient;

	@RequestMapping("/")
	public ModelAndView callPage(Model model) {
		return new ModelAndView("Home").addObject("insuranceRequest", new InsuranceRequest());
	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public ModelAndView insert(InsuranceRequest insuranceRequest) {

		InsuranceResponse insuranceResponse = this.insuranceClient.getInsurance(insuranceRequest);

		ModelAndView modelAndView = new ModelAndView("Home");
		modelAndView.addObject("response", insuranceResponse);

		return modelAndView;
	}
}

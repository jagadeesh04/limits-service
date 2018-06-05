package com.jag.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jag.microservices.limitsservice.bean.LimitConfiguratiion;

@RestController
public class LimitsConfigurationController {

	@Autowired
	private Configuration configuration;
	
	
	@GetMapping("/limits")
	public LimitConfiguratiion retrieveLimitsFromConfigurations(){
		return new LimitConfiguratiion(configuration.getMaximum(), configuration.getMinimum());
	}
	
	
}

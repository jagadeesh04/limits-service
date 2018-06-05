package com.jag.microservices.limitsservice.bean;

public class LimitConfiguratiion {

	
	int maximum;
	int minimum;
	
	protected LimitConfiguratiion(){
		
	}
	public LimitConfiguratiion(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}
	public int getMaximum() {
		return maximum;
	}
	public int getMinimum() {
		return minimum;
	}
	
	
	
	
}

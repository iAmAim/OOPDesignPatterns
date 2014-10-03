package com.aim.starbuzzcoffee;

public abstract class Beverage {

	String description = "Beverage..";
	double cost;

	public String getDescription() { 

		return description;

	}

	public abstract double cost();

}

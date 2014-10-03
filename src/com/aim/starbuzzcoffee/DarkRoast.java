package com.aim.starbuzzcoffee;

public class DarkRoast extends Beverage {

	public DarkRoast() {
		description = "Dark Roast";
	}

	public String getDescription() {

		return description;

	}

	public double cost() {
		return 1.50;
	}

}

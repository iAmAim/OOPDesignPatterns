package com.aim.DecoratorExample;

import com.aim.starbuzzcoffee.Beverage;
import com.aim.starbuzzcoffee.DarkRoast;
import com.aim.starbuzzcoffee.Mocha;

public class DecoratorExample {

	public static void main(String[] args) {

		Beverage myDrink = new DarkRoast();
		System.out.println(myDrink.getDescription() + 
		 ", $" + myDrink.cost());
		
		Beverage myMocha = new DarkRoast();
		myMocha = new Mocha(myMocha);
		myMocha = new Mocha(myMocha);
		System.out.println(myMocha.getDescription() + ", $"  +myMocha.cost());
	} 

}

package com.aim.strategyexample;

import com.aim.duck.Duck;
import com.aim.duck.FlyWithMechanicalWings;
import com.aim.duck.MallardDuck;
import com.aim.duck.RubberDuck;

public class StrategyPattern {

	public static void main(String[] args) {

		Duck mallardDuck = new MallardDuck();
		mallardDuck.display();
		mallardDuck.performFly();

		Duck rubberDuck = new RubberDuck();
		rubberDuck.display();
		rubberDuck.performFly();

		// Now maybe the rubber duck has been upgraded to have mechanical wings
		// so using strategy pattern it's now possible to
		// change the fly behavior of any duck during runtime.
		
		rubberDuck.setFlyBehavior(new FlyWithMechanicalWings());
		rubberDuck.display();
		rubberDuck.performFly();
	}

}

package com.aim.duck;

public abstract class Duck {

	public FlyBehavior flyBehavior; // interface references are private by default so you need to set this to public
	public QuackBehavior quackBehavior;

	public Duck() {

	}

	public abstract void display();

	public void performFly() {
		flyBehavior.fly();
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

}

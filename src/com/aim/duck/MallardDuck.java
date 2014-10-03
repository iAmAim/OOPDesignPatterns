package com.aim.duck;


public class MallardDuck extends Duck {

	public MallardDuck() {

		flyBehavior = new FlyWithWings(); 

	}

	public void display() {
		System.out.println("My parents told me I'm a Mallard Duck..");
	}

}

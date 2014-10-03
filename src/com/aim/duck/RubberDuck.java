package com.aim.duck;

public class RubberDuck extends Duck{
	
	public RubberDuck(){
		flyBehavior = new FlyNoWay();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I am a rubber duck..");
		
	}
	
	

}

package com.ust.examples;
//about abstract class
abstract class Car {
	int x;
	abstract void insuranceDetails();
	void display() {}
}
public class Abstraction extends Car{
	void insuranceDetails()
	{
		System.out.println("good");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Abstraction();
		c.insuranceDetails();
		

	}

}

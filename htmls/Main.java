package com.ust.examples;

class Animalxyz{
	String name;
	
public void eat()
	{
		System.out.println("i can eat");
		
	}
}
class Cat extends Animalxyz {
	public void display()
	{
		System.out.println(name);
		
	}
}
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cat lab=new Cat();
lab.name="Rohu";
lab.eat();
lab.display();
	}	

}

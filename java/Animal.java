package com.ust.examples;

 class Animal1 {
	String name;
	
 public void eat()
	{
		System.out.println("i can eat");
		
	}
}
class Dogs extends Animal1 {
	public void display()
	{
		System.out.println(name);
		
	}
}
 public class Animal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dogs lab=new Dogs();
lab.name="Rohu";
lab.eat();
lab.display();
	}

}

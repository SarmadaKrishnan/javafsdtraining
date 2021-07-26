package com.ust.examples;
interface Animal3{
	public void animalSound();
	public void sleep();
}
class Pig implements Animal3{
	public void animalSound() {
		System.out.println("me");
	}
	public void sleep() {
		System.out.println("zzz");
	}
}

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Pig myPig=new Pig();
       myPig.animalSound();
       myPig.sleep();
	}

}

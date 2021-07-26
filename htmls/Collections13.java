package com.ust.examples;

public class Collections13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoClass demo=new DemoClass();
		demo.<String>genericsMethod("Java programming");
		demo.<Integer>genericsMethod(25);
	}}
class DemoClass{
	public <T> void genericsMethod(T data)
	{
		System.out.println("Generics method:");
		System.out.println("Data Passed:"+data);

	}

}

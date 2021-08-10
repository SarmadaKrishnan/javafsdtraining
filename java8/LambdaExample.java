package com.ust.lambda;

public class LambdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld mylambda1=(String s)->{System.out.println("Hello1"+s);};
		HelloWorld mylambda2=s->{System.out.println("Hello2"+s);};
		mylambda1.greet("world");
		mylambda2.greet("jip");
		

	}

}
interface HelloWorld
{
	public void greet(String WELCOME);
}

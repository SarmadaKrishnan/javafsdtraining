package com.ust.lambda;

public class Java8Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Java8Tester tester=new Java8Tester();
  MathOperation addition=(int a,int b)->a+b;
  MathOperation subtraction=(a,b)->a-b;
  MathOperation multiplication=(int a,int b)->{return a*b;};
  MathOperation division=(int a,int b)->a/b;
  System.out.println("10+5="+tester.operate(10,5,addition));
  System.out.println("10-5="+tester.operate(10,5,subtraction));
  System.out.println("10*5="+tester.operate(10,5,multiplication));
  System.out.println("10/5="+tester.operate(10,5,division));
  GreetingService greetService1=(message) -> System.out.println("Hello"+message);
  GreetingService greetService2=(message)->System.out.println("hello"+message);
  greetService1.sayMessage("Mahesh");
  greetService2.sayMessage("Suresh");}
	interface MathOperation{
		int operation(int a,int b);
	}
	interface GreetingService{
		void sayMessage(String message);
	}
	private int operate(int a,int b,MathOperation mathOperation)
	{
		return mathOperation.operation(a, b);
		
	}
}


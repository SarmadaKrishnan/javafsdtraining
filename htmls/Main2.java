package com.ust.examples;
interface Firstinterface{
	public void myMethod();
}
interface Secondinterface{
	public void myOtherMethod();
}

class DemoClass1 implements Firstinterface,Secondinterface{
	public void myMethod() {
		System.out.println("xyz");
	}
	public void myOtherMethod() {
		System.out.println("me");
	}
}
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      DemoClass1 myObj=new DemoClass1();
      myObj.myMethod();
      myObj.myOtherMethod();
	}

}

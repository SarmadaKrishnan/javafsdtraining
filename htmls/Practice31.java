package com.ust.examples;

class Base {
	void display()
	{
		System.out.println("base");
	}
}
class Derived extends Base
{
	final void disp()
	{
		System.out.println("main");
	}
}
public class Practice31
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Derived d=new Derived();
      d.disp();
	}

}

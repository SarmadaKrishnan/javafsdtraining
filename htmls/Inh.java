package com.ust.examples;

class A{
	public void print_A()
	{
		System.out.println("print a");
	}
}

class B extends A{
	public void print_B()
	{
		System.out.println("print B");
	}
}

class C extends A{
	public void print_C()
	{
		System.out.println("print C");
	}
}

public class Inh {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     B a=new B();
     a.print_A();
     
     C b=new C();
     b.print_A();
		
	}

}

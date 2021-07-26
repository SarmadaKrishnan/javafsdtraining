package com.ust.examples;

class One{
  
	public void print_hello()
	{
		System.out.println("hello");
	}
}
class Two extends One
{
	public void print_world() {
		System.out.println("hi");
	}
}
public class Exercise2{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Two h=new Two();
     h.print_hello();
     h.print_world();
	}

}

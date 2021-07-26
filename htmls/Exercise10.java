package com.ust.examples;

class Calculation {
	int z;
	
	public void Addition(int x,int y)
	{
		z=x+y;
		System.out.println("The sum of the given nos:"+z);
	}
	
	public void Subtraction(int x,int y)
	{
		z=x-y;
		System.out.println("The difference of the given nos:"+z);
	}}

public class Exercise10 extends Calculation {
	public void multiplication(int x,int y)
	{
		z=x*y;
		System.out.println("Product of given nos:"+z);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20,b=10;
		Exercise10 demo=new Exercise10();
		demo.Addition(a, b);
		demo.multiplication(a, b);
		demo.Subtraction(a, b);

	}

}

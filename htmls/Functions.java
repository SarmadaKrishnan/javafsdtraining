package com.ust.examples;

public class Functions {
	int x;
	int y;
	int calculate (int a,int b)
	{
		return a+b;
	}
	float calculate (float a,float b)
	{
		return a+b;
	}
	String calculate (String a,String b)
	{
		return a+b;
	}
	void calculate()
	{
		
	}
	{
		int z=5;
		System.out.println(z);
	}
	int z=7;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Functions e=new Functions();
    int m=e.calculate(5, 6);
    float n=e.calculate(5.6f, 7.5f);
    String o=e.calculate("hello", " hi");
    
    System.out.println(m);
    System.out.println(n);
    System.out.println(o);
	}
	}



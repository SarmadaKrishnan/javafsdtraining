package com.ust.examples;

public class Exercise14 {
	int x;
	float y;
	String z;
	
	Exercise14(){}
	
	Exercise14(int x,float y)
	{
	    this.x=x;
	    this.y=y;
	
	}
	Exercise14(int a,float b,String c)
	{
		this(a,b);
	//	x=a;
	//	y=b;
		z=c;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise14 e1=new Exercise14();
		System.out.println(e1.x);
		Exercise14 e2=new Exercise14(3,4.8f);
		System.out.println(e2.y);
		Exercise14 e3=new Exercise14(3,4.8f,"suma");
		System.out.println(e3.z);

	}

}

package com.ust.examples;
interface Polygon
{
	void getArea(int length,int breadth);
}
class Rectangle implements Polygon{
public void getArea(int length,int breadth)
{
	System.out.println(length*breadth);
}
}
class Square implements Polygon{
	public void getArea(int length,int breadth)
	{   //breadth=0;
		System.out.println(length*length);
	}
}
public class Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Rectangle r1=new Rectangle();
r1.getArea(5, 7);
Square r2=new Square();
r2.getArea(5, 0);
	}

}

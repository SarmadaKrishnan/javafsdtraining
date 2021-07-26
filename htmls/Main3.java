package com.ust.examples;
class Student
{
	int roll;
	void getData(int p)
	{
		roll=p;
	}
	void Display()
	{
		System.out.println(roll);
	}
}
class Test12 extends Student
{
	double p1,p2;
	void PutMarks(double x,double y){
		p1=x;
		this.p2=y;}
	void ShowMarks()
	{
		System.out.println(p1);
		System.out.println(p2);
	}
}
interface Sports
{
	double weight=50.0;
	void ShowWeight();
	
}
class Results extends Test12 implements Sports
{
	double total;
	public void ShowWeight()
	{
		System.out.println(weight);
	}
	void DisplayAll()
	{
		total=p1+p2+weight;
		Display();
		ShowMarks();
		ShowWeight();
		System.out.println(total);
	
	}
}
public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Results res=new Results();
            res.getData(101);
            res.PutMarks(55.5,89.70);
            res.DisplayAll();
	}

}

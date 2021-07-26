package com.ust.examples;

abstract class Sarmada1{
	private String name;
	private int paymentPerHour;
	 
	void display()
	{
		System.out.println(name);
		
	}
	public Sarmada1(String name, int paymentPerHour)
	{
		this.name=name;
		this.paymentPerHour=paymentPerHour;
	}
	public Sarmada1() {}
	public abstract void intcalculateSalary(int x,int y);
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getPaymentPerHour()
	{
		return paymentPerHour;
	}
	public void setPaymentPerHour(int paymentPerHour)
	{
		this.paymentPerHour=paymentPerHour;
	}}
	
	public class Employees extends Sarmada1{
		Employees()
		{
			super();
		}
		Employees(String name,int Emplohour)
		{
			super(name,Emplohour);
		}
		
	public void intcalculateSalary(int days,int total_sal)
	{
		if((total_sal/days)>5000)
		{
			System.out.println("good");
		}
		else
		{
			System.out.println("bad");
		}
	}
	

public static void main(String[] args) {
		// TODO Auto-generated method stub
// Program30 e=new Program30("sarmada",32);
// e.display();
 Employees e1=new Employees();
 e1.display();
    
    
	}
	}

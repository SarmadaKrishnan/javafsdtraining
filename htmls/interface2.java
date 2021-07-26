package com.ust.examples;
interface Empl
{
	int eid=2101;
	void geteid();
}
class Demo
{
	public static void main(String args[])
	{
		Empl ob=new Empl() {
			public void geteid()
			{
				System.out.println("Employee id is"+eid);
			}
		};
		ob.geteid();
	}
}

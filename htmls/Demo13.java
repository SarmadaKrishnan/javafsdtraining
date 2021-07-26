package com.ust.examples;

interface Emp
{
	int eid=2101;
	void geteid();
}
class ImplClass implements Emp
{
	public void geteid()
	{
		System.out.print("employee id is"+eid);
	}
}
class Demo13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ImplClass ob=new ImplClass();
ob.geteid();
	}

}

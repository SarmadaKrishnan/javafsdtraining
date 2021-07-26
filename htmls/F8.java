package com.ust.examples;
class Red
{
	int x;
	final void Reddy()
	{
		System.out.println("yes");
	}
}
public class F8 extends Red{
	/*void Reddy()
	{
		System.out.println("no");
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Red e=new F8();
		e.Reddy();

	}

}

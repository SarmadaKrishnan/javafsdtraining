package com.ust.examples;

public class Outer {
	private void getValue()
	{
		int sum=20;
		class Inner
		{
			public int divisor;
			public int remainder;
			
			public Inner()
			{
				divisor=4;
				remainder=sum%divisor;
			}
			private int getDivisor()
			{
				return divisor;
			}
			private int getRemainder()
			{
				return sum%divisor;
			}
			private int getQuotient()
			{
				System.out.println("inside inner class");
				return sum/divisor;
			}
		}
		Inner inner=new Inner();
	    System.out.println(inner.getDivisor());
	    System.out.println(inner.getRemainder());
	    System.out.println(inner.getQuotient());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Outer outer=new Outer();
    outer.getValue();
	}

}

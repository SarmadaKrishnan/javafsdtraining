package com.ust.examples;

public class InnerClass {
	int x;
	void display()
	{
		System.out.println("outer class");
	}
	private class Inner{
		int y;
		Inner(int y,int x)
		{
			this.y=y;
			InnerClass.this.x=x;
		}
		void display() {
			System.out.println("eg of inner class");
		}
	}

	public static void main(String[] args) {
		InnerClass.Inner e1=new InnerClass().new Inner(6,5);
		e1.display();
		InnerClass e2=new InnerClass();
		e2.display();
		e2.x=5;
		System.out.println(e2.x);
		e1.display();

	}

}

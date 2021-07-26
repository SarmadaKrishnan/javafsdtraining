package com.ust.examples;


public class MethodLocalInnerClass{
	void outerMethod() {
		System.out.println("inside outermethod");
		
		class Inner{
			void innerMethod() {
				System.out.println("inside innermethod");
			}
		}
		Inner y=new Inner();
		y.innerMethod();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MethodLocalInnerClass outer=new MethodLocalInnerClass();
outer.outerMethod();
	}

}

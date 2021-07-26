package com.ust.examples;

abstract class Test {
	abstract int getInterestRate(int x);}
class HDFC extends Bankname{
	int getInterestRate(int x) {
		return 8;
	}}
class ICICI extends Test{
	int getInterestRate(int y) {
		return 10;
	}}
public class Bankname{ 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFC b1=new HDFC();
		System.out.println(b1.getInterestRate(5));
		Test b2=new ICICI();
		System.out.println(b2.getInterestRate(5));

	}

}

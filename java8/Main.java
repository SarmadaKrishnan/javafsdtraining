package com.ust.lambda;
import java.lang.FunctionalInterface;

@FunctionalInterface
interface MyInterface{
	double getPiValue();
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    MyInterface ref;
    ref=()->3.1415;
    System.out.println("value of pi="+ref.getPiValue());
	}

}

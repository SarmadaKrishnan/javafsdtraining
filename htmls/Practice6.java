package com.ust.examples;

public class Practice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Replace Region";
		//"Aeplace Aegion"
		System.out.println(str.replace('R', 'A'));
		//"Raplace Region"
		System.out.println(str.replaceFirst("Re", "Ra"));
		//"Raplace Ragion"
		System.out.println(str.replaceAll("Re", "Ra"));

	}

}

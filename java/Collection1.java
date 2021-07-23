package com.ust.examples;

import java.util.ArrayList;
import java.util.Collections;

public class Collection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arr=new ArrayList();
		arr.add("2");
		arr.add("Hi");
		arr.add(4.2f);
		arr.add(2,"Hari");
		arr.remove(1);
		System.out.println(arr);
		
		ArrayList<Integer>x=new ArrayList<Integer>();
		x.add(4);
		x.add(10);
		x.add(0);
		Collections.sort(x);
		System.out.println(x);
		int y=4;
		for(int i=0;i<x.size();i++)
		{
			if(x.get(i)==y)
			{
				System.out.println("exsist");
				System.out.println("index is"+i);
			}
		}
		System.out.println(x);
	}

}

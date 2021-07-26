package com.ust.examples;

public class Practice7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double array[]= {10,20,30,40,50};
		double sum=0.0;
		double avg=0.0;
		
		for(int i=0;i<array.length;i++)
		{
			sum=sum+array[i];
		}
		
		avg=sum/array.length;
		System.out.println("Average:"+avg);
		System.out.println("Sum:"+sum);
	}

}

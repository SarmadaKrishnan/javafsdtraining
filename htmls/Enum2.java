package com.ust.examples;
enum Directions5{
	EAST,
	WEST,
	NORTH,
	SOUTH
}

public class Enum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Directions5 dir=Directions5.NORTH;
if(dir==Directions5.EAST) {
	System.out.println("directions:East");
}
else
	if(dir==Directions5.WEST)
	{
		System.out.println("directions:west");	
	}
	else
		if(dir==Directions5.NORTH)
		{
			System.out.println("directions:north");	
		}
		else
		{
			System.out.println("direction:south");
		}
}}
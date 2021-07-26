package com.ust.examples;
enum Directions6{
	EAST,
	WEST,
	NORTH,
	SOUTH
}
public class Enum3 {
	Directions6 dir;
	public Enum3(Directions6 dir) {
		this.dir=dir;
	}
	public void getMyDirection()
	{
		switch(dir) {
		case EAST:
			System.out.println("east");
			break;
		case WEST:
			System.out.println("west");
			break;	
		case NORTH:
			System.out.println("NORTH");
			break;
		default:
			System.out.println("south");
			break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Enum3 obj1=new Enum3(Directions6.EAST);
		obj1.getMyDirection();
		Enum3 obj2=new Enum3(Directions6.SOUTH);
		obj2.getMyDirection();
		

	}

}

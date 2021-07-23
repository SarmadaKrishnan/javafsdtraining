package com.ust.examples;
enum Directions7{
	EAST("E"),
	WEST("W"),
	NORTH("N"),
	SOUTH("S")
;
private final String shortcode;
Directions7(String code){
	this.shortcode=code;
}
public String getDirectionCode()
{
	return this.shortcode;
}
public class Enum4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Directions7 dir=Directions7.SOUTH;
System.out.println(dir.getDirectionCode());
Directions7 dir2=Directions7.EAST;
System.out.println(dir2.getDirectionCode());
	}

}}

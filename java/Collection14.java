package com.ust.examples;
class GenericsClasses <T extends Number>
{
	public void display() {
		System.out.println("this is a bounded type generics class");
	}
}
class Collection14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
GenericsClasses<Integer> obj=new GenericsClasses<>();
obj.display();
	}

}

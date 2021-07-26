package com.ust.examples;

public class Constructor {
  int x;
  Constructor(){
	  System.out.println("constructor created");
  }
  Constructor(int y){
	  System.out.println("y="+y);
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Constructor o=new Constructor();
     Constructor p=new Constructor(5);
	}

}

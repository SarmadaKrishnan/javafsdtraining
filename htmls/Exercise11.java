package com.ust.examples;

 class Super_class {
      int num=20;
      public void display() {
    	  System.out.println("Display method of super class");
      }}
public class Exercise11 extends Super_class{
	int num=10;
	
	public void display() {
	System.out.println("subclass");
}

      
	public void my_method() {
		// TODO Auto-generated method stub
      Exercise11 sub=new Exercise11();
      sub.display();
      super.display();
      System.out.println(sub.num);
      System.out.println(super.num);
      
     }
  public static void main(String args[])
  {
	  Exercise11 obj=new Exercise11();
	  obj.my_method();
}
}
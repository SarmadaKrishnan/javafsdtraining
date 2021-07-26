package com.ust.examples;

public class Practice9 {
	String web;
	Practice9(String w)
	{
		web=w;
	}
	Practice9(Practice9 cc)
	{
		web=cc.web;
	}
	
    void disp() {
    	System.out.println("Constructor: "+web);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Practice9 obj1=new Practice9("Example of Copy Constructor in Java");
      Practice9 obj2=new Practice9(obj1);
      obj1.disp();
      obj2.disp();
      
	}

}

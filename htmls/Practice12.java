package com.ust.examples;

public class Practice12 {
    int a=9;
    int b=18;
    void m1() {
    	a=10;
    	b=20;
    }
class Test{
	static void m1(Practice12[] e)
	{
		e[1].m1();
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Practice12[] ex= {new Practice12(),new Practice12(),new Practice12()};
      Test.m1(ex);
      for(int i=0;i<ex.length;i++)
      {
    	  System.out.println(ex[i].a+"\t");
    	  System.out.println(ex[i].b+"\n");
      }
	}

}

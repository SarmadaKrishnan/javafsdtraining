package com.ust.examples;
import java.io.FileInputStream;

public class EgFile4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  try {
	  FileInputStream input=new FileInputStream("D:\\Sample.txt");
	  System.out.println("data in the file");
	  int i=input.read();
	  while(i!=-1)
	  {
		  System.out.print((char)i);
		  i=input.read();
	  }
	  input.close();
  }
  catch(Exception e)
  {
   e.getStackTrace();
	}

}
}
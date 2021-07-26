package com.ust.examples;
import java.io.IOException;
import java.io.FileWriter;

public class File1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		String str="Hello hi";
    
	try {
		FileWriter fw = null;
		fw = new FileWriter("D:\\Sample1.txt");
		for(int i=0;i<str.length();i++)
	    {
	    	//fw.write(str.charAt(i));
	    	fw.write(str.charAt(i));
	    }

			//System.out.println("succesfull");
    fw.close();		
	    
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally
	{
		System.out.println("succesfull");
	}

}}

package com.ust.examples;
import java.io.FileReader;

public class EgFile5 {

	public static void main(String[] args) {
		char[] arr=new char[100];
		try {
			FileReader input=new FileReader("D://Sample1.txt");
			input.read(arr);
			System.out.println("data in the file: ");
			System.out.println(arr);
			input.close();
		}
    catch(Exception e)
		{
    	e.getStackTrace();
		}
	}

}

package com.ust.examples;

import java.io.File;
import java.io.IOException;

public class Example12 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("C:\\Users\\ustjava15\\Sample.txt");
		if(f.createNewFile())
		{
			System.out.println("new file is created");
		}
		else
		{
			System.out.println("file already created");
		}
	}

}

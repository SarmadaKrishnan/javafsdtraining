package com.ust.examples;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Egfile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File f=new File ("D:\\Sample.txt");
			//f.write("hello");
			Scanner read=new Scanner(f);
			while(read.hasNext())
			{
				String data=read.nextLine();
				System.out.println(data);
			}
			read.close();
		}
		catch(IOException e)
		{
			System.out.println("occured");
		}

	}
}



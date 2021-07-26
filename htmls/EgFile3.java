package com.ust.examples;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class EgFile3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File fname=new File("D:\\Sample.txt");
			if(fname.createNewFile())
			{
				System.out.println("file is created");
			}
			else
			{
				System.out.println("already exsists");
			}
			System.out.println(fname.canRead());
			//System.out.println(fname.canWrite());
			System.err.println("error found");
			Scanner s=new Scanner(System.in);
			String txt=s.nextLine();
			System.out.println(txt);
			fname.setReadable(false);
			fname.setWritable(true);
			System.out.println(fname.canWrite());
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}

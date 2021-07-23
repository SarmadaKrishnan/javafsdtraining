package com.ust.examples;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class EgFile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File f=new File("D:\\Sample.txt");
			FileReader read=new FileReader(f);
			int ch;
			while((ch=read.read())!=-1)
			{
				System.out.print((char)ch);
			}
			read.close();
		}
		catch(IOException e)
		{
			System.out.println("occured");
		}

	}

}

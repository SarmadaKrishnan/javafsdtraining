package com.ust.examples;
import java.io.File;

public class EgFile6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
File file=new File("D://Sample3.txt");
try {
	file.createNewFile();
}
catch(Exception e)
{
	e.getStackTrace();
}
File newFile=new File("D://Sample4.txt");
boolean value=file.renameTo(newFile);
if(value) {
	System.out.println("name of file is changed");
}
else {
	System.out.println("name cannot be changed");
}
	}

}

package com.ust.examples;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EgFile8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
File file=new File("D:\\Sample4.txt");
FileWriter fileWriter=null;
BufferedWriter bufferedWriter=null;
try {
	fileWriter=new FileWriter(file);
	bufferedWriter=new BufferedWriter(fileWriter);
	bufferedWriter.write("eg");
	bufferedWriter.write("\n using bufferedwriter \n");
	bufferedWriter.write("bufferedreader");
	bufferedWriter.flush();}
catch(IOException e)
{e.printStackTrace();}
finally {
	try {
		if(fileWriter!=null)
		{ fileWriter.close();}
		if (bufferedWriter!=null)
		{
			bufferedWriter.close();
		}
	}
	catch(IOException e)
	{
		e.printStackTrace();}}
//FileReader filereader=null;
FileReader filereader1=null;
BufferedReader bufferedReader=null;
try {filereader1=new FileReader(file);
bufferedReader=new BufferedReader(filereader1);
String line=null;
while((line=bufferedReader.readLine())!=null)
{
	System.out.println(line);}}
catch(IOException e)
{
	e.printStackTrace();}
finally { try
{
	if(filereader1!=null)
	{
		filereader1.close();
	}
	if(bufferedReader!=null)
	{
		bufferedReader.close();
	}}
catch(IOException e)
{
	e.printStackTrace();
	}

	}
}
	}



package com.ust.examples;

import java.io.File;
import java.io.IOException;

public class Egfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	File f=new File("D:\\Sample.txt");
	if(f.createNewFile())
	{
		System.out.println(f.getName());
	}
	else
	{
		System.out.println("ALREADY EXSISTS");
	} }
	catch(IOException exy)
	{
		System.out.println("exception occured");
	}
}}
	




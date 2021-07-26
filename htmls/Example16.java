package com.ust.examples;

public class Example16 {
	String fName;
	String lName;
	String City;
	String Address;
	String Dob;
	float Salary;
	
	Example16(String x,String y,String z,String a,String b,float c)
	{
		fName=x;
		lName=y;
		City=z;
		Address=a;
		Dob=b;
		Salary=c;
				
	}
	
	void display()
	{
		System.out.println(fName+" "+lName+" "+City+" "+ Address+" "+Dob+" "+Salary);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Example16 e1=new Example16("Sarmada","Krishnan","Ekm","xyz","02-10-1996",45000);
		Example16 e2=new Example16("Alona","Kumar","Kottayam","abc","08-11-2018",56000);
		Example16 e3=new Example16("Akhila","Vishnu","pta","ghi","09-7-1998",78000);
		Example16 e4=new Example16("Apoorva","Cyrus","idukki","hjk","17-6-1999",93000);
		Example16 e5=new Example16("Yamini","pk","jkl","mno","6-11-1987",63000);*/
		//Example16 e;
		
		Example16 array[]=new Example16[5];
		array[0]=new Example16("Sarmada","Krishnan","Ekm","xyz","02-10-1996",45000);
		array[1]=new Example16("Alona","Kumar","Kottayam","abc","08-11-2018",56000);
		array[2]=new Example16("Akhila","Vishnu","pta","ghi","09-7-1998",78000);
		array[3]=new Example16("Apoorva","Cyrus","idukki","hjk","17-6-1999",93000);
		array[4]=new Example16("Yamini","pk","jkl","mno","6-11-1987",63000);
		/*
		for(Example16 e:array)
		{
			e.display();
		}*/
		/*for(int i=1;i<=5;i++)
		{
		 ( e.toString()+i).
	    		
	
		}*/
   /*	e2.display();
		e3.display();
		e4.display();
		e5.display();
*/
		for(int i=0;i<array.length;i++)
		{
			array[i].display();
		}
	}

}

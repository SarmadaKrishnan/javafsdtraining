package com.ust.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Student15{
	int rollno;
	String name;
	int age;
	Student15(int rollno,String name,int age)
	{
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
}
class NameComparator implements Comparator{
	public int compare(Object o1,Object o2)
	{
		Student15 s1=(Student15)o1;
		Student15 s2=(Student15)o2;
		return s1.name.compareTo(s2.name);
	}
}
public class Collection18  {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList al=new ArrayList();
al.add(new Student15(101,"Vijay",23));
al.add(new Student15(106,"Sammu",26));
al.add(new Student15(105,"Ashwin",28));
System.out.println("sorting by names");
Collections.sort(al,new NameComparator());
Iterator itr=al.iterator();
while(itr.hasNext()) {
	Student15 st=(Student15)itr.next();
	System.out.println(st.rollno+" "+st.name+" "+st.age);	
}
	}

}

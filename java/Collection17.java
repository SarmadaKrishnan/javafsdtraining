package com.ust.examples;

import java.util.Enumeration;
import java.util.Hashtable;

public class Collection17 {

	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub
		Enumeration<E> names;
		String key;
		Hashtable<String,String>hashtable=new Hashtable<String,String>();
		hashtable.put("key1","sarmada");
		hashtable.put("key2","parvathy");
		names=(Enumeration<E>) hashtable.keys();
		while(names.hasMoreElements())
		{
			key=(String)names.nextElement();
			System.out.println("key:"+key+"& value: "+hashtable.get(key));
		}
	}

}

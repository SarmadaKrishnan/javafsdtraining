package com.ust.examples;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Enum8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedHashMap<Integer,String>hm=new LinkedHashMap<Integer,String>();
hm.put(2, "geeks");
hm.put(3, "for");
hm.put(1, "GEEKS");
for(Entry<Integer, String> mapElement:hm.entrySet())
{
	Integer key=mapElement.getKey();
	String value=mapElement.getValue();
	System.out.println(key+":"+value);
}
	}

}

package com.ust.examples;
import java.util.*;

public class Collection8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     HashSet<String> hs=new HashSet<String>();
     hs.add("Geeks");
     hs.add("For");
     hs.add("Geeks");
     hs.add("is");
     hs.add("very helpful");
     Iterator<String> itr=hs.iterator();
     while(itr.hasNext()) {
    	 System.out.println(itr.next());
     }
     
	}

}

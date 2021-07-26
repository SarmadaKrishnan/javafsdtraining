package com.ust.examples;
import java.util.*;

public class Collection5 {

	public static void main(String[] args) {
		List list=Arrays.asList("one two three four five six one three four".split(" "));
		System.out.println("List:"+list);
		List sublist=Arrays.asList("three four".split(" "));
		System.out.println("SubLIST: "+sublist);
		System.out.println("indexofsublist: "+ Collections.indexOfSubList(list, sublist));
		System.out.println("lastIndexOfSubList: "+Collections.lastIndexOfSubList(list, sublist));

	}

}

package com.collection.classprograms;

import java.util.TreeSet;

public class TreesetCompareTo {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		
		
		ts.add("K");
		ts.add("Z");
		ts.add("A");
		
		//here implicitly compareTo method called by JVM.
		System.out.println(ts);

	}

}

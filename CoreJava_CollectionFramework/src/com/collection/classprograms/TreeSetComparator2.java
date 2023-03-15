package com.collection.classprograms;

import java.util.Comparator;

import java.util.TreeSet;

public class TreeSetComparator2 {

	public static void main(String[] args) {
		
        TreeSet <String> ts = new TreeSet<String>(new MyComparator1());
        
        ts.add("Mahesh");
        ts.add("Maharashtra");
        ts.add("Shubham");
        ts.add("Siddhesh");
        
        System.out.println(ts);
	}
 
}


class MyComparator1 implements Comparator<Object> 
{

	@Override
	public int compare(Object o1, Object o2) {
		
		String i1 = (String)o1;
		String i2 = (String)o2;
		
		//return i2.compareTo(i1);
		return -i2.compareTo(i1);
		
}
}
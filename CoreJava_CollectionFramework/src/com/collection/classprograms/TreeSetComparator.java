package com.collection.classprograms;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetComparator {

	public static void main(String[] args) {
		
		
		TreeSet <Integer> ts = new TreeSet<Integer>(new MyComparator());
		
		ts.add(20);
		ts.add(15);
		ts.add(89);
		ts.add(36);
		ts.add(12);
		
		System.out.println(ts);
		
	}
	
}

class MyComparator implements Comparator<Object> 
{

	@Override
	public int compare(Object o1, Object o2) {
		
		Integer i1 = (Integer)o1;
		Integer i2 = (Integer)o2;
		
		//return i1.compareTo(i2); //default natural order(Ascending order)
		//return i2.compareTo(i1); //descending order
		//return -i1.compareTo(i2);//descending order
		//return -i2.compareTo(i1);//ascending order
		//return +1;               //insertion order
		//return -1;               //reverse insertion order
		  return 0;                //first element
		
		
		
        		
	}
	
}

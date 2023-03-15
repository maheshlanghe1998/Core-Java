package com.collection.classprograms;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetComparator3 {

	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet(new MyComparator4());
		
		ts.add("AA");
		ts.add(new StringBuffer("ABC"));
		ts.add(new StringBuffer("ABCD"));
		ts.add("A");
		ts.add("ZZZ");
		
		System.out.println(ts);
		

	}

}


class MyComparator4 implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 =o2.toString();
		int l1 = s1.length();
		int l2 =s2.length();
		//return s1.compareTo(s2);
		if(l1<l2)
		{
			return -1;
			
		}
		else if(l1>l2)
		{
			return +1;
		}
		
		else
		{
			return s1.compareTo(s2);
		}
	}
	
}
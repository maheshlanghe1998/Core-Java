package com.collection.classprograms;


import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		TreeMap <Integer,String> m = new TreeMap<Integer, String>(new MyComparator5());
		
		m.put(100, "ABC");
		m.put(105, "XYZ");
		m.put(103, "EFG");
		m.put(108, "LMN");
		m.put(104, "PQR");
		
		System.out.println(m);
		
		
		//Navigable Methods:
		
		
		System.out.println(m.floorEntry(108));
		System.out.println(m.ceilingEntry(100));
		System.out.println(m.higherKey(105));
		System.out.println(m.lowerKey(105));
		System.out.println(m.firstEntry());
        System.out.println(m.lastEntry());
		System.out.println(m.pollFirstEntry());
        System.out.println(m);
        System.out.println(m.pollLastEntry());
        System.out.println(m.descendingKeySet());
        System.out.println(m);

	}

}

class MyComparator5 implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;
		return i2.compareTo(i1);
	}
	
}

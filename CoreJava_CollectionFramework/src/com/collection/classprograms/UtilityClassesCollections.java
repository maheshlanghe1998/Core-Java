package com.collection.classprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class UtilityClassesCollections {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add(10);
		list.add(0);
		list.add(20);
		list.add(15);
		list.add(5);
		System.out.println("Insertion order"+list); // insertion order
		Collections.reverse(list);
		System.out.println("Reverse of insertion order "+list);
		Collections.sort(list);
		System.out.println("Ascending order: "+list);
		
		Collections.sort(list, new MyComparator10());
		System.out.println("Descending order: "+list);
		
		System.out.println(Collections.binarySearch(list, 10, new MyComparator10()));//return index
		System.out.println(Collections.binarySearch(list, 13, new MyComparator10()));//return insertion point
		System.out.println(Collections.binarySearch(list, 17, new MyComparator10()));//return insertion point
	}

}

class MyComparator10 implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;
		return i2.compareTo(i1);
	}
	
}
package com.collection.classprograms;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashsetDemo {
	
	
	public static void main(String[] args) {
		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
		
		hs.add(10);
		hs.add(30);
		hs.add(20);
		hs.add(50);
		hs.add(60);
		
		System.out.println(hs);
		Iterator<Integer> it = hs.iterator();
		
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		
		
		
	}

}

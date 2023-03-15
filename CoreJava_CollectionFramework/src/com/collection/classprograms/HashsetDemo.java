package com.collection.classprograms;

import java.util.HashSet;
import java.util.Iterator;


public class HashsetDemo {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		
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

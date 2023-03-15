package com.collection.classprograms;

import java.util.TreeSet;

public class TreesetDemo {

	public static void main(String[] args) {
		
       TreeSet <Integer>ts = new TreeSet<Integer>();
       
       ts.add(30);
       ts.add(40);
       ts.add(50);
       ts.add(70);
       ts.add(60);
       
      System.out.println(ts);

      //predefine methods of navigable set :
      
      System.out.println(ts.ceiling(30));
      System.out.println(ts.higher(30));
      System.out.println(ts.floor(40));
      System.out.println(ts.pollFirst());
      System.out.println(ts.pollLast());
      System.out.println(ts.descendingSet());
      System.out.println(ts.first());
      System.out.println(ts.last());
      System.out.println(ts.headSet(40));
      System.out.println(ts.tailSet(40));
      System.out.println(ts.subSet(40, 60));
      System.out.println(ts);
      
	}

}

package com.collection.classprograms;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList <Integer> ll = new LinkedList<Integer>();
		
		//Adding elements in LinkedList:
		
		ll.add(10);
		ll.add(1, 20);
		ll.add(30);
		ll.add(40);
		ll.addLast(50);
		ll.addFirst(5);
		System.out.println(ll);
		
		
		//removing element from LinkedList:
		 ll.remove(3);
		 ll.removeFirst();
		 ll.removeLast();
		 System.out.println(ll);
		
		 
		 //Modifying  Linked list:
         ll.set(2, 30);
         System.out.println(ll);
         
         
         //Iterating elements: 
         
         for (int i = 0; i < ll.size(); i++) { 
        	    
             System.out.print(ll.get(i) + " "); 
         } 
         
         
         
         //linked List to Array:
         System.out.println();
         
         Object [] o = ll.toArray();
         
         for( Object elements: o)
         {
         System.out.print(elements+" ");
         }
         
         
         //size of linked list:
         System.out.println();
         System.out.println(ll.size());
         
	}

}

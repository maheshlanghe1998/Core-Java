package com.collection.classprograms;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		
		
		//inserting element into arraylist
		al.add(10);
		al.add(40);
		al.add(60);
		al.add(35);
		al.add(50);
		
		System.out.println(al);
		
		
		//getting element from the list by its index
		int element =al.get(2);
		System.out.println(element);
		
		//modifying the element of the list :
		al.set(0, 30);
		System.out.println(al);
		
		//delete from arraylist
		al.remove(0);
		System.out.println(al);
		

		//Retrieve the arraylist elements
		for(int i = 0;i<al.size();i++)
		{
			System.out.print(al.get(i)+" ");
		}
		
		// size of arraylist
		System.out.println("\n"+al.size());
		
		
		//sort arraylist
		Collections.sort(al);
		System.out.println("sorting in ascending order: "+al);
	
	    
		//clone an arraylist to another arraylist
		
		
		ArrayList list =(ArrayList) al.clone();
		
		System.out.println(list);

		
		//remove all elements from arraylist	
				al.clear();
				System.out.println(al);
		
				
		
	}

}

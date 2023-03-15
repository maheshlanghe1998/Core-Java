package com.collection.classprograms;

import java.util.ArrayList;

public class ArrayListOfArrayList {

	public static void main(String[] args) {
		
		
		ArrayList <ArrayList <Integer>> list = new ArrayList<ArrayList<Integer>>();
	
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		
		al1.add(10);
		al1.add(20);
		
		list.add(al1);
		
        ArrayList<Integer> al2 = new ArrayList<Integer>();
		
		al2.add(30);
		al2.add(40);
		
		list.add(al2);
		
		System.out.println(list);
		
	}

}

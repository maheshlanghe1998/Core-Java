package com.collection.classprograms;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayListToVector {

	public static void main(String[] args) {
		
       ArrayList <String> list  =new ArrayList<>();
       
       list.add("Mahesh");
       list.add("Sid");
       list.add("Akash");
       
       System.out.println("Array List : "+list);
       
       Vector <String> v = new Vector<String>(list);
       
       System.out.println("Vector : "+v);

	}

}

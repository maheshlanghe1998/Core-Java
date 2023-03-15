package com.collection.classprograms;

import java.util.ArrayList;
import java.util.Vector;

public class VectorToArrayList {

	public static void main(String[] args) {
		
		 Vector <String> v = new Vector<String>();
	   
		   v.add("Mahesh");
	       v.add("Sid");
	       v.add("Akash");
	       System.out.println("Vector : "+v);

		
		 ArrayList <String> list  =new ArrayList<>(v); 
	     System.out.println("Array List : "+list);
	       
	      
	}

}

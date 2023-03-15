package com.collection.classprograms;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<String> st = new Stack<String>();
		
		st.push("mahesh");
		st.push("siddhesh");
		st.push("shubham");
		st.push("aniket");
		
		System.out.println(st);
		
		System.out.println(st.pop());
		System.out.println(st.pop());
		
		System.out.println(st.peek());
		
		
		Iterator<String> it =  st.iterator();	
		
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		
		System.out.println();
		ListIterator <String> lit = st.listIterator();
		while(lit.hasNext())
		{
			System.out.print(lit.next()+" ");
		}

	}

}

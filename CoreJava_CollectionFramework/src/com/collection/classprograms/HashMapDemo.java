package com.collection.classprograms;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		
		HashMap <Integer,String> h = new HashMap<Integer, String>();
		
		
		h.put(1, "Mahesh");
		h.put(10, "sid");
		h.put(5, "Shubham");
		h.put(6, "Shubham");
		h.put(6, "Akash");
		
		System.out.println(h);
		
		Set<Integer> s = h.keySet();
		System.out.println(s);
		
		Collection<String> c = h.values();
	    System.out.println(c);
	    
	    Set s1 = h.entrySet();
	    System.out.println(s1);
	    
	    Iterator i = s1.iterator();
	    
	    
	    while(i.hasNext())
	    {
	    	
	    	Map.Entry m1 = (Map.Entry) i.next();
	    	System.out.println(m1.getKey()+" "+m1.getValue());
	    	
	    	if(m1.getKey().equals(10))
	    		
	    	{
	    		m1.setValue("Siddhesh");
	    		
	    	}
	    }
		
		
		System.out.println(h);
		
	}

}

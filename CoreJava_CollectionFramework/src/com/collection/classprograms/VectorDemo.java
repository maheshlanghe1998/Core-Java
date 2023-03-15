package com.collection.classprograms;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		
		Vector<Integer> v = new Vector<Integer>();
		
		System.out.println(v.capacity());
		
		for(int i =1;i<=10;i++)
		{
			v.add(i);
		}
		
		System.out.println(v);
		System.out.println(v.capacity());
		
		v.add(11);
		System.out.println(v.capacity());
		
		
		v.add(10, 14);
		System.out.println(v);
		
		v.remove(10);
		System.out.println(v);
		
		v.addElement(12);
        System.out.println(v);
        
           
       //iterating element with Enumeration:
        
        
        Enumeration<Integer> e = v.elements();
        
        
        while(e.hasMoreElements())
        {
        	int i = (int) e.nextElement();
        	
        	if(i%2==0)
        	{
        		System.out.println(i);
        	}
        }
        
        System.out.println(v);
        
        
        
        Iterator<Integer> i = v.iterator();
        
       while(i.hasNext())
       {
    	   
    	   int a = i.next();
    	   
    	   if(a%2==0)
    	   {
    		   
    	    	  System.out.print(a+" ");  
    	   }
    	   else
    	   {
    		   i.remove();
    		   
    	   }
    	    
       }
        
       System.out.println("\n"+v);
       
       ListIterator<Integer> li= v.listIterator();
       
       while(li.hasNext())
       {
    	   
       }
       
        v.clear();
        System.out.println(v);
        
	}

}

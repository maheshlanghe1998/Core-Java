package com.collection.classprograms;

import java.util.Hashtable;

class Temp
{
	
	int i;

	public Temp(int i) {
		super();
		this.i = i;
	}
	
	
	public int hashCode()
	{
		
		return i;
		
	}


	@Override
	public String toString() {
		return i + "";
	}
	
	
}


public class HashTableDemo {

	public static void main(String[] args) {
		
		
		Hashtable ht = new Hashtable();
		
		ht.put(new Temp(10), "M");
		ht.put(new Temp(2), "A");
		ht.put(new Temp(15), "B");
		ht.put(new Temp(25), "X");
		ht.put(new Temp(16), "F");
		ht.put(new Temp(23), "E");
		
		
		System.out.println(ht);
	}

}

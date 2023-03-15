package com.collection.classprograms;

import java.util.Arrays;
import java.util.Comparator;

public class UtilityClassesArrays {

	public static void main(String[] args) {
		
		String arr []= {"M", "A","Z","Q"};
		
		 Arrays.sort(arr);
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.print(arr[i]+" ");
		 }
		 
		 System.out.println("\n"+Arrays.binarySearch(arr, "M"));
		
		 System.out.println("\n"+Arrays.binarySearch(arr, "X"));
			
		 Arrays.sort(arr, new MyComparator11());
		 
		 System.out.println("\n"+Arrays.binarySearch(arr, "M",new MyComparator11()));
			
		 System.out.println("\n"+Arrays.binarySearch(arr, "X",new MyComparator11()));
			
		
	}

}



class MyComparator11 implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		
		return s2.compareTo(s1);
	}
	
}
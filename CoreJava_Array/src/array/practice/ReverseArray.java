package array.practice;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int arr []= {10,20,60,82,89,74,45};
		//System.out.println(Arrays.toString(arr));
		
        System.out.println("Array Before Reverse: ");     
	    for(int i = 0;i<arr.length;i++)
	    {
	    	System.out.print(arr[i]+" ");
	    }
	    
	    System.out.println("\n\nArray After Reverse: ");
	    for(int i=arr.length-1;i>=0;i--)
	    {
	    	System.out.print(arr[i]+" ");
	    }
	    
	    
	}

}

package array.practice;

//import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		
	
		/*
		System.out.println("By using pre-defined method: \nSorted Array: ");
		Arrays.sort(arr);
		
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		
		System.out.println("\n\nLargest element: "+arr[arr.length-1]);
		System.out.println("Second Largest element: "+arr[arr.length-2]);
		
		*/
		System.out.println("\nWithout using pre-defined method: ");
		
		System.out.println(Integer.MIN_VALUE);
		
		int arr[]= {56,89,43,72,83,14,47};
		
		int largest =Integer.MIN_VALUE;
		
		int second_largest =Integer.MIN_VALUE;
		
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]>largest)  
			{
				largest=arr[i];  
			}

			else if(arr[i]>second_largest && arr[i]!=largest)  
			{
				second_largest=arr[i];  
			}
		
		}
		System.out.println("Largest Element: "+largest);
		
		System.out.println("Second Largest Element: "+second_largest);
		
		
	}

}

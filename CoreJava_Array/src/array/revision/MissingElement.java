package array.revision;

import java.util.Scanner;

public class MissingElement {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size: ");
	    int size = sc.nextInt();
	    
	    int arr[]=new int [size+1];
	    
	    System.out.println("Enter the array element: ");
	    for(int i=0;i<arr.length;i++)
	    {
	    	arr[i]=sc.nextInt();
	    }
	    
	    int expected_number=arr.length+1;
	    int total_sum=(expected_number*(expected_number+1))/2;
	    int sum=0;
	    for(int i=0;i<arr.length;i++)
	    {
	    	sum=sum+i;
	    }
        System.out.println("Missing element: "+(total_sum-sum));
	}

}

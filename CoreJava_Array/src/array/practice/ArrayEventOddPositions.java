package array.practice;

public class ArrayEventOddPositions {

	public static void main(String[] args) {
		//printing elements for even and odd positions: 
		int arr[]= {45,79,14,12,63,53,44,28};
		
		System.out.println("The Even Position: ");
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0)
			{
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println("\nThe Odd Position: ");
		for(int j=0;j<arr.length;j++)
		{
			if(j%2!=0)
			{
				System.out.print(arr[j]+" ");
			}
		}
	}

}

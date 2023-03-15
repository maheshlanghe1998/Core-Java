package array.practice;

public class MissingElement {

	public static void main(String[] args) {
		
		int arr[]= {10,11,12,14};
		
		int expected_element=arr.length+1;
		
		int total_sum = expected_element*(expected_element+1)/2;
		System.out.println(total_sum);
		
		int sum =0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+i;
			
		}
		System.out.println("Missing element: "+(total_sum-sum));
	}

}

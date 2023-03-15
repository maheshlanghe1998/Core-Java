package assignment.day9;

public class SumRange {
	
	static int sumRange(int a, int b)
	{
		int sum=0;
		if(b<a)
		{
			System.out.println("Error!");
		}
			
		else
		{
			for(int i=a;i<=b;i++)
				sum+=i;
		}
		
		return sum;
			
	}

	public static void main(String[] args) {
		System.out.println(sumRange(100,50));
		
	}

}

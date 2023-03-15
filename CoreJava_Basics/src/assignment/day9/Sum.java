package assignment.day9;

public class Sum {

   static int sum100()	
   {
	int sum=0;
	for(int i=1;i<=100;i++)
	{
		sum+=i;
	}
	
	return sum;
	   
   }
	public static void main(String[] args) 
	{
		System.out.println(sum100());
	}

}

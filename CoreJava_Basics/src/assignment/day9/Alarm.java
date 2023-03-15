package assignment.day9;

public class Alarm {
	
	static void alarm(int n)
	{
		if(n<1)
		{
			System.out.println("Error!");
		}
		else
		{
			for(int i=1;i<=n;i++)
			{
				System.out.println("Alarm!");
			}
		}
	}

	public static void main(String[] args) 
	{
		alarm(10);
	}

}

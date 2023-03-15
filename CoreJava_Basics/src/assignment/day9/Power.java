package assignment.day9;

public class Power {

	static void powersOfTwo()
	{
		for(int i=2;i<=10;i++)
		{
			int num= (int) Math.pow(2, i);
			
			System.out.println(num);
		}
		
	}
	public static void main(String[] args) {
		
		powersOfTwo();
	}

}

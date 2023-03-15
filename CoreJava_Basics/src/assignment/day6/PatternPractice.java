package assignment.day6;

public class PatternPractice {

	public static void main(String[] args) {
		
		for(int i=64;i<=68;i++)   
		{
			for(int j=64;j<=i;j++)
			{
				System.out.print((char)(i+1)+" ");
			}
			System.out.println();
		}
	}

}

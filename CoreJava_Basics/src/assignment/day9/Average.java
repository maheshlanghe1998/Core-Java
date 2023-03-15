package assignment.day9;


public class Average {
	
	int average(int a,int b,int c)
	{
		int avg=(a+b+c)/3;
		return avg;
	}
	
	float average(float a,float b,float c)
	{
		float avg=(a+b+c)/3;
		return avg;
	}

	public static void main(String[] args) {
		
		Average obj= new Average();
		System.out.println("The average of 3 Number: "+obj.average(10.26f, 20.56f, 30.23f));
		
	}

}

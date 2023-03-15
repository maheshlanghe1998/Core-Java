package assignment.day8;

public class ConstructorDemo {
	
	
	ConstructorDemo()
	{
		
		System.out.println("This is non parametrized constructor");
	}
	
	ConstructorDemo(int a, int b)
	{
		int c=a+b;
		System.out.println("The sum is: "+c);
	}
	

	public static void main(String[] args) 
	{
		ConstructorDemo cd=new ConstructorDemo();
		ConstructorDemo cd1=new ConstructorDemo(10,20);
	}

}

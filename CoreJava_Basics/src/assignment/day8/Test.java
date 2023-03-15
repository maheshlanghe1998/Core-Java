package assignment.day8;

public class Test {
	static
	{
		System.out.println("This is static block");
	}
	
	{
		System.out.println("This is instance block..");
	}
	
	Test()
	{
		System.out.println("This is Non-parameterized constructor");
	}
	
	Test(int a,int b)
	{
		System.out.println("This is parameterized constructor");
	}
	
	public static void method1()
	{
		System.out.println("This is static method");
	}

	public void method2()
	{
		System.out.println("This is Non-static/instance method");
	}

	public static void main(String[] args) 
	{
		Test obj=new Test();
		new Test();
		new Test(10,20);
		Test.method1();
		//or
		//method1();
		
		obj.method2();
		

	}

}

package practiceaccessmodifier;

public class AcessModifiers {

	public void m1()
	{
		// the public modifier accessible everywhere  
		System.out.println("This is method with public modifier");
	}
	
	void m2()
	{
		// the public modifier accessible within class, within package only 
		System.out.println("This is method with defalut modifier");
	}
	
	protected void m3()
	{    // the public modifier accessible within class, within package, outside package by extending class only.
		System.out.println("This is method with protected modifier");
	}
	
	private void m4() 
	{   
		//it has very limited scope within the same class only 
		System.out.println("This is method with private modifier");
	}
	
	public static void main(String[] args) 
	{
		
		AcessModifiers am=new AcessModifiers();
		am.m1(); //calling public method within same class and same package.
		am.m2(); //calling default method within same class and same package.
		am.m3(); //calling protected method within same class and same package.
		am.m4(); //calling public method within same class and same package.
	}

}

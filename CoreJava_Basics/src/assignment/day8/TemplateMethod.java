package assignment.day8;

public class TemplateMethod {
	
	String sales() 
	{
		return "sales report";
		
	}
	
	static String admin() 
	{
		return "admin report";
		
	}
	
	String finance() 
	{
		return "finance report";
		
	}
	
	void deliveryManager () 
	{
		System.out.println(sales());
		System.out.println(admin());
		System.out.println(finance());
	}
	
	

	public static void main(String[] args) 
	
	{
		TemplateMethod obj=new TemplateMethod();
		obj.deliveryManager();
	}

}

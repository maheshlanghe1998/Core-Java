package assignment.day11.Shirt;

class Shirt 
{
	private int shirtCollarSize;
	private  int shirtSleevLength;
	private String material;
	
	public Shirt()
	{  
		
		shirtSleevLength=34;
		shirtCollarSize=17;
		material="Cotton";
	   	
	}
	
	public Shirt(int shirtCollarSize, int shirtSleevLength) 
	{
	    
		this.shirtCollarSize = shirtCollarSize;
		this.shirtSleevLength = shirtSleevLength;
		
	}
	public int getShirtCollarSize() 
	{
		return shirtCollarSize;
	}
	public void setShirtCollarSize(int shirtCollarSize) 
	{
		this.shirtCollarSize = shirtCollarSize;
	}
	public int getShirtSleevLength() 
	{
		return shirtSleevLength;
	}
	public void setShirtSleevLength(int shirtSleevLength) 
	{
		this.shirtSleevLength = shirtSleevLength;
	}
	public String getMaterial() 
	{
		return material;
	}
	public void setMaterial(String material) 
	{
		this.material = material;
	}
	
	void display()
	{
		System.out.println("Shirt Collar Size: "+shirtCollarSize);
		System.out.println("Shirt sleeve size: " +shirtSleevLength);
		System.out.println("Shirt Material   : " +material);
	}
}

public class TestShirt 
{
     public static void main(String args[])
     {
    	 Shirt s= new Shirt();
    	 s.display();
    	 System.out.println("*************************");
    	 
    	 Shirt s1= new Shirt(16,32);
    	 s1.setMaterial("Poplin");
    	 s1.display();
    	 System.out.println("*************************");
    	 
    	 Shirt s2= new Shirt(18,36);
    	 s2.setMaterial("Denim");
    	 s2.display();
    	 System.out.println("*************************");
     }
}

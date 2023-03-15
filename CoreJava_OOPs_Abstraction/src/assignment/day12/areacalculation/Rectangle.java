package assignment.day12.areacalculation;

public class Rectangle extends Shape
{
	float length;
	float breadth;
	
	
	public Rectangle(float length, float breadth) 
	{
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public double calculateArea() {
		
		return length*breadth;
	}
    
}

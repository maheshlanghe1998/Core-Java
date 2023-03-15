package assignment.day12.areacalculation;

public class Triangle extends Shape
{
	float base, height;
	
	Triangle(float base, float height)
	{
		this.base=base;
		this.height=height;
		
	}

	@Override
	public double calculateArea() {
		
		return (0.5*base*height);
	}
    
}

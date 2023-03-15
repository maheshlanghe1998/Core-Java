package assignment.day12.areacalculation;

public class Circle extends Shape
{
    double radius;
    
    Circle(double radius)
    {
    	this.radius=radius;
    	
    }
    
	@Override
	public double calculateArea() {
		
		return Math.PI*radius*radius;
	}

	
}

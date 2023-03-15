package assignment.day12.shape;

public class Circle extends Shape
{
	private double radius;
    

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	void draw() {
		System.out.println("Shape: Circular Shape");
		
	}

	@Override
	double area() {
		
		 return Math.PI*radius*radius;
		
	}

	@Override
	void display() {
	 draw();
	System.out.printf("The Area of Circle: %.2f", area());
	 
	}
   
}

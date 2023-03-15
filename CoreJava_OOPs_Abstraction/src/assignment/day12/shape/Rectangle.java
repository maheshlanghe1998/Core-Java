package assignment.day12.shape;

public class Rectangle extends Shape 
{
     private double length;
     private double breath;
     
     
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getBreath() {
		return breath;
	}
	public void setBreath(double breath) {
		this.breath = breath;
	}
	@Override
	void draw() {
		System.out.println("Shape: Rectangular Shape");
		
	}
	@Override
	double area() {
		
		return length*breath;
	}
	@Override
	void display() {
		draw();
		System.out.printf("The area of Rectangle: %.2f",area());
		
	}
     
     
}

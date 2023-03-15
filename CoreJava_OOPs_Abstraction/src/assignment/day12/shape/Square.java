package assignment.day12.shape;

public class Square extends Shape
{
    private double side;

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	void draw() {
		
		System.out.println("Shape: Square Shape");
	}

	@Override
	double area() {
		
		return (side*side);
	}

	@Override
	void display() {
		draw();
		System.out.printf("The area of Rectangle: %.2f",area());
		
	}
    
}

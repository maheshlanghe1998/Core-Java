package assignment.day12.shape;

import java.util.Scanner;

public class MainShape {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		Circle c= new Circle();
		System.out.println("Enter the radius: ");
		c.setRadius(sc.nextDouble());
		c.display();
		
		Rectangle r=new Rectangle();
		System.out.println("\n\nEnter the length: ");
		r.setLength(sc.nextDouble());
		System.out.println("Enter the breath: ");
		r.setBreath(sc.nextDouble());
		r.display();
		
		Square s =new Square();
		System.out.println("\n\nEnter the side: ");
		s.setSide(sc.nextDouble());
		s.display();
		
	}

}

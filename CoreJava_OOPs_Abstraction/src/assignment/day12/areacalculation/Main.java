package assignment.day12.areacalculation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Shape: ");
		String s= sc.next();
		if(s.equals("Circle"))
		{
			System.out.println("Enter the radius :");
			double radius=sc.nextDouble();
		    Circle c= new Circle(radius);
		    double circle= c.calculateArea();
		    System.out.printf("The area of Circle is : %.2f",circle);
		}
		
		else if (s.equals("Rectangle"))
		{
			System.out.println("Enter the length :");
			float length =sc.nextFloat();
			System.out.println("Enter the breadth :");
			float breath =sc.nextFloat();
		    Rectangle r= new Rectangle(length,breath);
		    float rectangle= (float) r.calculateArea();
		    System.out.printf("The area of Rectangle is : %.2f",rectangle);
		}
		
		else if (s.equals("Triangle"))
		{
			System.out.println("Enter the base :");
			float base =sc.nextFloat();
			System.out.println("Enter the height :");
			float height =sc.nextFloat();
		    Rectangle t= new Rectangle(base,height);
		    float rectangle= (float) t.calculateArea();
		    System.out.printf("The area of Triangle is : %.2f",rectangle);
		}

	}

}

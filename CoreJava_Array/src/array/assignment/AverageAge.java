package array.assignment;

import java.util.Scanner;

public class AverageAge {

	public void calculateAverage(int[] age, int size) 
	{
		float avg;
		int sum = 0, count = 0;
		for (int i = 0; i < size; i++) 
		{
			if (age[i] < 28 || age[i] > 40) 
			{
				System.out.println("Invalid age encountered!");
				break;
			} 
			else 
			{
				sum += age[i];
				count++;
			}

		}
		if (count != 0) 
		{
			avg = sum / size;
			System.out.println("The average age is " + avg);
		}

	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total no.of employees:");
		int size = sc.nextInt();
		if (size < 2) 
		{
			System.out.println("Please enter a valid employee count");
		}
		else 
		{
			int[] age = new int[size];
			System.out.println("Enter the age for " + size + " employees:");

			for (int i = 0; i < size; i++) 
			{
				age[i] = sc.nextInt();
			}

			AverageAge aa = new AverageAge();
			aa.calculateAverage(age, size);
		}

	}
}

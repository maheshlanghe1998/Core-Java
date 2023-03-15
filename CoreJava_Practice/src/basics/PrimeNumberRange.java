package basics;

import java.util.Scanner;

public class PrimeNumberRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();

		System.out.println("\nPrime Numbers between 1 to " + num + " are: ");

		int flag = 0, sum = 0;
		if (num > 1) 
		{

			for (int i = 2; i <= num; i++) 
			{
				int count = 0;

				for (int j = 2; j <= i; j++) 
				{

					if (i % j == 0) 
					{
						count++;
					}

				}

				if (count == 2)
				{
					System.out.print(i + " ");
					flag++;
					sum += i;
				}
			}

			System.out.println("\n\ncount of Prime Numbers between 1 to " + num + " is: " + flag);
			System.out.println("\nsum of Prime Numbers between 1 to " + num + " is: " + sum);

		}
	}

}

package assignment.day4;

import java.util.Scanner;

public class HighestPlacement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of students placed in CSE: ");
		int cse = sc.nextInt();
		System.out.println("Enter the no of students placed in ECE: ");
		int ece = sc.nextInt();
		System.out.println("Enter the no of students placed in MECH: ");
		int mech = sc.nextInt();

		// int cse=85,ece=85,mech=55;
		/*
		 * if(cse<0||mech<0||ece<0) { System.out.println("Input is Invalid "); }
		 */

		if (cse == ece && cse == mech && ece == mech) {
			System.out.println("None of the department has got the highest placement");
		}

		else if (cse >= 0 && mech >= 0 && ece >= 0) {

			if (cse > ece && cse > mech) {
				System.out.println("Highest Placement " + "\nCSE");
			}

			else if (ece > mech && ece > cse) {
				System.out.println("Highest Placement " + "\nECE");
			} else if (mech > cse && mech > ece) {
				System.out.println("Highest Placement " + "\nMECH");
			} else if (cse == ece) {
				System.out.println("Highest Placement \nCSE\nECE");
			} else if (cse == mech) {
				System.out.println("Highest Placement \nCSE\nMECH");
			} else if (ece == mech) {
				System.out.println("Highest Placement \nECE\nMECH");

			}

		}

		else {
			System.out.println("Input is Invalid");
		}

		/*
		 * if(cse==ece ) { System.out.println("CSE"); System.out.println("ECE");
		 * 
		 * } else if (cse==mech) { System.out.println("CSE");
		 * System.out.println("MECH"); } else if(ece==mech) { System.out.println("ECE");
		 * System.out.println("MECH"); }
		 * 
		 */
	}

}

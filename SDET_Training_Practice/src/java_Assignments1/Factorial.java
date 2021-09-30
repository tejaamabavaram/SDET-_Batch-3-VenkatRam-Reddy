package java_Assignments1;

import java.util.Scanner;


/**
 * @author Nelaturi Venkat Ram Reddy
 *
 */

public class Factorial {

	public static void main(String[] args) {

		int fact = 1;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number :");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			
			
	        if (num == 0)
	            System.out.println("Factorial is: 1");

			fact = fact * i;
		}

		System.out.println("Factorial of " + num + " is: " + fact);
	}

}

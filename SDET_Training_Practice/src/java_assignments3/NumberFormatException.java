/**
 * 
 */
package java_assignments3;

import java.util.Scanner;

/**
 * @author NelaturiR
 *
 */
public class NumberFormatException {

	/**
	 * @param number
	 */
	public static void main(String[] args) {
		int number;

		Scanner sc = new Scanner(System.in);

		while (true) {

			// Display message
			System.out.println("Enter any valid Integer: ");

			// Try block to check if any exception occurs
			try {

				number = Integer.parseInt(sc.next());

				System.out.println("You entered: " + number);
				
				break;
			}

			// Catch block to handle NumberFormatException
			catch (Exception e) {

				System.out.println("NumberFormatException occured");
			}
		}
	}

}

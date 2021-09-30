/**
 * 
 */
package java_assignments2;

import java.util.Scanner;

/**
 * @author Nelaturi Venkata Rami Reddy
 *
 */
public class NumberReverse {

	/**
	 * @param Positive
	 *            Integer Number
	 */

	public static void main(String[] args) {

		int num, rem, rev = 0;
		System.out.println("Enter a Number to Reverse:");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		// Reverse the Given Number
		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;

		}

		System.out.println("Reverse of Given Number is:" + rev);


	}	

}

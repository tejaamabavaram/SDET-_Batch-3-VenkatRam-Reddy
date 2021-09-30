/**
 * 
 */
package java_assignments2;

import java.util.Scanner;

/**
 * @author Nelaturi Venkat Rami Reddy
 *
 */
public class ArrayNumbersAverage {

	/**
	 * @param Set of Postive Array elements
	 */
	public static void main(String[] args) {

		int sum = 0;
		float average = 0;
		System.out.println("Enter Size of Array:");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] marks = new int[size];
		System.out.println("Enter Array Elements:");

		// Read
		for (int i = 0; i < size; i++) {
			marks[i] = sc.nextInt();
		}

		System.out.println("Entered Arrays elements:");

		// print Array Elements
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i] + " ");
		}

		// calculate Sum of Array Elemnts

		for (int i = 0; i < marks.length; i++) {
			sum = sum + marks[i];
		}

		// Print Sum value
		System.out.println("Sum of Array Elements is " + sum);

		// Calculate Average of Arra Elemnts

		average = (sum / marks.length);

		// print Avearge of Array Elements

		System.out.println("Average of Array Elements is:" + average);

	}

}

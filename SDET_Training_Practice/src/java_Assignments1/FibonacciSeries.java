/**
 * 
 */
package java_Assignments1;

import java.util.Scanner;

/**
 * @author Nelaturi Venkat Ram Reddy
 *
 */
public class FibonacciSeries {

	/**
	 * @param Positive
	 *            Number A series where the next term is the sum of previous two
	 *            terms. The first two terms of the Fibonacci sequence is 0 followed
	 *            by 1. The Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
	 */
	public static void main(String[] args) {

		int a = 0;
		int b = 1, fibseq = 0;

		System.out.println("Enter number to calculate fibseq:");
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		// Calculate the Fibonacci sequence

		for (int i = 2; i <= num; i++) {
			fibseq = a + b;
			a = b;
			b = fibseq;

		}
		System.out.println("Fibonacci sequence for " + num + " is:" + fibseq);

	}

}

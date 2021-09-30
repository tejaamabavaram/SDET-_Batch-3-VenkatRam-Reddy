/**
 * 
 */
package java_Assignments1;

import java.util.Scanner;

/**
 * @author Nelaturi Venkat Ram Reddy
 *
 */
public class PrimeNumbers {

	/**
	 * @param Integer
	 *            value
	 */
	public static void main(String[] args) {

		for (int num = 1; num <= 100; num++) {
			int temp = 0;

			for (int i = 2; i <= num - 1; i++) {
				if (num % i == 0)

				{
					temp = temp + 1;
				}

			}
			if (temp == 0) {

				System.out.print(num + "  ");
			}

		}
	}

}

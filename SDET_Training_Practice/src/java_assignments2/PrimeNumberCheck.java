/**
 * 
 */
package java_assignments2;

import java.util.Scanner;

/**
 * @author Nelaturi Venkata Rami Reddy
 *
 */
public class PrimeNumberCheck {

	/**
	 * @param positive Integer
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter A Number to check prime or not: ");
		int num = sc.nextInt();
		int temp =0;

			for (int i = 2; i <= num - 1; i++) {
				if (num % i == 0)

				{
					temp = temp + 1;
				}

			}
			if (temp == 0) {

				System.out.print(num + "  is Prime Number ");
			}
			else
			{
				System.out.println(num +"  is not Prime Number");
			}


	}

}

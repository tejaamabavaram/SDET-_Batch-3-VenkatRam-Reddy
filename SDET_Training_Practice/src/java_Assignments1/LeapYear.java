/**
 * 
 */
package java_Assignments1;

import java.util.Scanner;

/**
 * @author Nelaturi Venkat Ram Reddy
 *
 */
public class LeapYear {

	/**
	 * @param year
	 */
	public static void main(String[] args) {

		System.out.println("Enter an Year :: ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();

		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
			System.out.println(year +" year is a leap year");
		else
			System.out.println(year+ " year is not a leap year");

	}

}

package practice;

import java.util.Scanner;
/*
 * @Author: Venkat Ram Reddy Nelaturi
 * factorial of n (n!) = 1 * 2 * 3 * 4 * ... * n
 * @Param: Positive Number
*/
public class FactorialUsingWhileLoop {
	public static void main(String[] args) {

		int fact = 1;
		int i = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();

		while (i <= num) {
			fact = fact * i;
			i++;

		}

		System.out.println("\nFactorial of " + num + " is: " + fact);
	}
}

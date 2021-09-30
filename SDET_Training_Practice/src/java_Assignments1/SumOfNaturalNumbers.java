/**
 * 
 */
package java_Assignments1;

import java.util.Scanner;

/**
 * @author Nelaturi Venkat Ram Reddy
 *
 */
public class SumOfNaturalNumbers {

	/**
	 * @param Postive Number
	 */
	public static void main(String[] args) {


		// reads user input using scanner Class
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Positie Number:");
		int num=  sc.nextInt();
		
		for (int i=1 ;i<=num;i++)
		{
			// Calculate sum of individual of given Number
			
			sum += i;
		}
		
		System.out.println("sum of Individuals of "+num+ "is:" +sum);
		

	}

}

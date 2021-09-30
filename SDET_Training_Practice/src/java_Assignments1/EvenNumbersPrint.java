/**
 * 
 */
package java_Assignments1;

import java.util.Scanner;

/**
 * @author Nelaturi Venkat Ram Reddy
 *
 */
public class EvenNumbersPrint {

	/**
	 * @param Positive Integer Number
	 */
	public static void main(String[] args) {
		
		
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number print Even Numbers ");
		int num = sc.nextInt();*/
		
		// Print even Numbers
		System.out.println("Even numebrs bewtwen 0 to 50: ");
		for (int i=0;i<50;i++)
		{
			if (i%2==0)
			{
				System.out.print(i+ "  ");
			}
		}
		
	}

}

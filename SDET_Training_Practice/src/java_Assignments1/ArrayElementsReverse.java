/**
 * 
 */
package java_Assignments1;

import java.util.Scanner;

/**
 * @author Nelaturi Venkata Rami Reddy
 *
 */
public class ArrayElementsReverse {

	/**
	 * @param Integer Array
	 */
	public static void main(String[] args) {


		Scanner sc =new Scanner(System.in);
		int [] marks = new int[5];
		
		// reading array elements from the user
		System.out.println("Enter the elements of the array: ");
		
		for(int i=0;i<marks.length;i++)
		{
			marks[i]= sc.nextInt();
			
			
		}
		
		System.out.println("Marks before Reverse:");
		
		for(int i=0; i<marks.length;i++)
		{
			
			// printing Inserted elements
			System.out.println(marks[i]);
		}
		

		System.out.println("Marks After Reverse:");
		for(int i=marks.length-1;i>=0;i--)
		{
			System.out.println(marks[i]);
		}
	}

}

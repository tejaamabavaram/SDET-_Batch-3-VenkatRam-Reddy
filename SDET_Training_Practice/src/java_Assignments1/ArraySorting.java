/**
 * 
 */
package java_Assignments1;

import java.util.Scanner;

/**
 * @author Nelaturi VenkataRam Reddy
 *
 */
public class ArraySorting {

	/**
	 * @param Integer Array
	 *  Array Elements _ Ascending order
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] marks = new int[5];

		// reading array elements from the user
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < marks.length; i++) {

			marks[i] = sc.nextInt();
		}
		int temp = 0;
		System.out.println("Array Elements Before Sorting:");
		for (int i = 0; i < marks.length; i++) {
			// Print the Arrya values before Sorting
			System.out.print(+marks[i] + " ");
		}

		for (int i = 0; i < marks.length; i++)

		{
			for (int j = i + 1; j < marks.length; j++) {

				if (marks[i] < marks[j]) {
					temp = marks[i];
					marks[i] = marks[j];
					marks[j] = temp;

				}

			}

		}
		System.out.println();

		System.out.println("Array Elements After Sorting:");
		for (int i = 0; i < marks.length; i++) {
			System.out.print(marks[i] + " ");
		}

	}

}

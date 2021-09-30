/**
 * 
 */
package java_assignments2;

import java.util.Scanner;

/**
 * @author Nelaturi venkata Rami Reddy
 *
 */
public class SumOfDigits {

	/**
	 * @param Positive Integer Number
	 */
	
	int num, m, sum=0;
	
	
	
	public static void main(String[] args) {
		
		SumOfDigits sd = new SumOfDigits();
		sd.calculateSumOfDigits();

	}
	
	// Calculate sum of individuals of given number
	public void calculateSumOfDigits()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter a Number:");
		num = sc.nextInt();
		while(num>0)
		{
			m= num%10;
			sum += m;
			num= num/10;
		}
		
		System.out.println("Sum of individual digits is:"+ sum);
		
	}

}

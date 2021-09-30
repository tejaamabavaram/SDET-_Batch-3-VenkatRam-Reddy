/**
 * 
 */
package java_Assignments1;

import java.util.Scanner;

/**
 * @author Nelaturi Venkat Ram Reddy
 *
 */
public class TriangleArea {

	/**
	 * @param height
	 *            and base
	 */

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

TriangleArea tArea= new TriangleArea();
tArea.calculateTriangleArea();
		
	}
	
	// Calculate Area of Triangle

	public void calculateTriangleArea() {
		System.out.println("Enter Height:");

		double height = sc.nextDouble();

		System.out.println("Enter base:");
		double base = sc.nextDouble();

		double area = (base * height) / 2;
		System.err.println("Area of Triangle is : " + area);

	}

}

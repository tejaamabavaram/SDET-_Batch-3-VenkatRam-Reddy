/**
 * 
 */
package java_assignments3;

import java.util.Scanner;

/**
 * @author Nelaturi VenkatRamiReddy
 *
 */
public class StrinPolindrom {

	/**
	 * @param String 
	 */
	public static void main(String[] args) {
		
		String str, rev="";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		str= sc.nextLine();
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev += str.charAt(i);
		}
		
		System.out.println("Reverse of a String is:"+ rev);
		
		if(str.equals(rev))
		{
			System.out.println("Given  String "+ str +"  is polindrom");
		}
		else
		{
			System.out.println("Given String  "+ str +  "  is not polindrom");
		}
			
			
		}
		

	}



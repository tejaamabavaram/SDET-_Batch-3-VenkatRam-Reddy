/**
 * 
 */
package java_assignments4;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author NelaturiR
 *
 */
public class ArrayListSorting {

	/**
	 * @param Array List
	 */
	public static void main(String[] args) {
		 ArrayList<String> listofcountries = new ArrayList<String>();
		   listofcountries.add("Telangana");
		   listofcountries.add("Shimla");
		   listofcountries.add("Chennai");
		   listofcountries.add("Delhi");

		  
		   System.out.println("Before Sorting:");
		   for(String counter: listofcountries){
				System.out.println(counter);
			}

		 
		   Collections.sort(listofcountries);

		 
		   System.out.println("After Sorting:");
		   for(String counter: listofcountries){
				System.out.println(counter);
			}


	}

}

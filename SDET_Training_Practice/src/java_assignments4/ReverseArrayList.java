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
public class ReverseArrayList {

	/**
	 * @param ArrayList
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList arrayList = new ArrayList();
		arrayList.add("Java");
		arrayList.add("C");
		arrayList.add("Selenium");
		arrayList.add("UFT");
		arrayList.add("Python");
		System.out.println("Before Reverse Order: " + arrayList);
		Collections.reverse(arrayList);
		System.out.println("After Reverse Order: " + arrayList);
	}

}

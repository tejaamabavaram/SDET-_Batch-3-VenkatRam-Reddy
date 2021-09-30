/**
 * 
 */
package java_assignments2;

/**
 * @author Nelaturi Venkata Rami Reddy
 *
 */
public class DuplicateElement {

	/**
	 * @param Postive Integer Array Elemnts
	 */
	public static void main(String[] args) {
		
		int []marks = {2, 32, 12, 45, 65, 93, 0, 23, 45, 6};
		

		for (int i=0; i<marks.length-1; i++) {
			for(int j=i+1;j<marks.length;j++)
			{
				if (marks[i]==marks[j])
				{
					System.out.println("Dupliate elements are :"+marks[i]);
				}
			}
		}
	}

}

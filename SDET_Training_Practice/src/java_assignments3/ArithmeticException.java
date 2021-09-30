/**
 * 
 */
package java_assignments3;

/**
 * @author NelaturiR
 *
 */
public class ArithmeticException {

	/**
	 * @param args ArithmeticNumber
	 */
	public static void main(String[] args) {
		

	      try{
	         int num1=30, num2=0;
	         int output=num1/num2;
	         System.out.println ("Result: "+output);
	      }
	      catch(Exception e){
	         System.out.println ("Divide By Zero Exception");
	      }
		
	}

}

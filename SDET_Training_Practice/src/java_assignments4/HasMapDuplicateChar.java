/**
 * 
 */
package java_assignments4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author NelaturiR
 *
 */
public class HasMapDuplicateChar {

	/**
	 * @param Character Array
	 */
	
		public void countDupChars(String str){
			 
		    //Create a HashMap 
		    Map<Character, Integer> map = new HashMap<Character, Integer>(); 
		 
		    //Convert the String to char array
		    char[] chars = str.toCharArray();
		 
		  
		    for(Character ch:chars)
		    {
		      if(map.containsKey(ch))
		      {
		         map.put(ch, map.get(ch)+1);
		      } 
		      else 
		      {
		         map.put(ch, 1);
		        }
		    }
		 
		    //Obtaining set of keys
		    Set<Character> keys = map.keySet();
		 
		    
		    for(Character ch:keys){
		      if(map.get(ch) > 1){
		        System.out.println("Char "+ch+" "+map.get(ch));
		      }
		    }
		  }
		 
		  public static void main(String a[]){
			  HasMapDuplicateChar obj = new HasMapDuplicateChar();
		    System.out.println("String:This is SDET Professional Course");
		    System.out.println("-------------------------");
		    obj.countDupChars("This is SDET Professional Course");
		  
		    System.out.println("\nString: Deepa Sharma");
		    System.out.println("-------------------------");
		    obj.countDupChars("Deepa Sharma");
		 
		


	}

}

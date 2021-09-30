/**
 * 
 */
package java_assignments3;

/**
 * @author NelaturiR
 *
 */
public class NestedTry {

	public static void main(String[] args) {
		try{  
		    try
		    {  
		     System.out.println("Division of a number by zero");  
		     int b =45/0;  
		    }
		    
		    catch(Exception e)
		    {
		    	System.out.println(e);
		    }  
		   
		    try{  
		    int a[]=new int[5];  
		    a[5]=4;  
		    
		    }
		    catch(ArrayIndexOutOfBoundsException e)
		    {
		    	System.out.println(e);
		    	}  
		     
		    System.out.println("other statements");  
		    
		  }
	 catch(Exception e)
	 {
		 System.out.println("Exception handeled");
		 }  
		  
		  System.out.println("normal flow..");  
		 }  


	}


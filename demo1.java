package userDefinedException;


//writing user defined exception
	class invalidException extends Exception{
		//get localized message 
		   /*String str1;
		  
		   invalidException(String str2) {
		    str1=str2;
		   }
		   */
		int num;
		invalidException(int x)
		{num=x;
		}
		
		  
		 //  get message to string
		   public String toString(){ 
			   // all code here exceute as a argument to catch block of type exception  
			   System.out.println( " the message  "); 
		    return ("Exception Occurred: "+num) ;
		   }  
		}//end of 
		  
		

public class demo1 {
	public static void main (String[] args)
	{// creating exception object  to throw 
		try {
			  System.out.println( "exception going to occur  ");
		throw new invalidException (4);
		}
		catch(invalidException e) {
			  System.out.println( " exception message recieved !! "+e);
		}
		}
	}

	

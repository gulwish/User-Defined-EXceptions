package error;
public class SOF {
	//Because of a non-terminating recursive call 
		public static void main(String[] args) 
		{
		    System.out.println(add5(1));
		}
/*when  calling itself,  when the space
//used to keep track of what functions you're in is filled up
//, you get the stack overflow error.
*/	public static int add5(int a) {
		    return add5(a) + 5;
		}
	}



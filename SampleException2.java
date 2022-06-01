package exception;
import java.util.Scanner;
public class SampleException2 {
public static void main(String[] args) 
		{
		int numerator,denominator,result;
		Scanner scan = new Scanner(System.in);
	       denominator= scan.nextInt();
		numerator= scan.nextInt();
		result=numerator/denominator;
		//program start 
System.out.print(" enter any numerator >>"+numerator);
System.out.print(" enter any denominator >>"+denominator);
System.out.println(" RESULT IS >>"+result);
//program end 
	}
	}



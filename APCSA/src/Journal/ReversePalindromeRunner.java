package Journal;

import java.util.Scanner; 
import Journal.ReversePalindromeRunner;

public class ReversePalindromeRunner
{
	public static void main( String args[] )
	{
		//add test cases
		
		int num;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a number: " );
		num = keyboard.nextInt();
		
		Reverse test = new Reverse(num);
		test.setReverse(num);
		System.out.println(test.toString());
		

		
	}
}
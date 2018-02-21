package Journal;

import static java.lang.System.*;

public class Reverse
{
   private int number;
   
   public Reverse()
   {
	   number = 0;
   }
	//add constructors
   public Reverse(int n)
   {
	   setReverse(n);
   }
	
   public void setReverse(int n)
   {
	   number = n; 
   }

	public int getReverse()
	{
		int rev=0;

		int num = number; 
		
		while(num > 0) { 
			//get the last digit 
			rev = rev * 10 + num % 10; 
			//1st time through rev = 4
			//2nd  rev = 40 +3
			//3rd rev = 432
			num = num/10;
			
		}
		
		return rev;
	}
	
	//public static boolean isPalindrome(int num) {
		//return num == getReverse(num);
	//}

	public String toString()
	{ 
		
		return number+ " reversed is " + getReverse();
	}
	
	
}
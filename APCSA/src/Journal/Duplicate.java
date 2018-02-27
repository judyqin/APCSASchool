package Journal;

import java.util.Arrays;
import java.util.Scanner;

public class Duplicate {
	
	/*public static String numlist(int[] numbers)
	{
		String s = "";
			for (int i = 0; i < numbers.length; i++)
			{
				s += numbers[i];
			}
		return s; 
	}*/
	
	public static String Eliminated(int[] numbers)
	{
		String list = "";
		
		for (int i = 0; i < numbers.length; i++)
		{
			for (int j = i+1; j < numbers.length; j++)
			{
				if (numbers[i] != numbers[j])
				{
					list += numbers[i];
					
				}
			}
		}
		return list; 
	}
	
	public static void main(String[] args)
	{
		
		int[] test = {1, 2, 3, 2, 1, 6, 3, 4, 5, 2};
		System.out.println(Arrays.toString(test)); 
		System.out.println(Eliminated(test));
		
	}
	
}

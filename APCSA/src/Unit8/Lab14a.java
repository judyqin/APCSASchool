package Unit8;

import java.util.Arrays;

public class Lab14a
{
	public static void main( String args[] )
	{
		int[] one = {4,10,0,1,7,6,5,3,2,9};
		//int[] numbers = new int[9];
		//numbers[0] = 4; 
		//numbers[1] = 10; 

		System.out.println(Arrays.toString(one));
		System.out.println("sum of spots 3-6  =  " + ArrayFunHouse.getSum(one,3,6));
		System.out.println("sum of spots 2-9  =  " + ArrayFunHouse.getSum(one,2,9));
		System.out.println("# of 4s  =  " + ArrayFunHouse.getCount(one,4));		
		System.out.println("# of 9s  =  " + ArrayFunHouse.getCount(one,9));	
		System.out.println("Array without 7's " + Arrays.toString(ArrayFunHouse.removeVal(one,7)));


		int[] two = {4,2,3,4,6,7,8,9,0,10,0,1,7,6,5,3,2,9,9,8,7};
		
		//add test cases
		
			
	}
}
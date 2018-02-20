package Journal;

import java.util.Scanner;

public class DecimaltoBinary {
	public static void main (String[] args) { 
		
		Scanner keyboard = new Scanner(System.in);
		int decimal; 
		String binary;
		
		System.out.println("Enter a decimal integer between 0 and 255: ");
		decimal = keyboard.nextInt();
		
		binary = " ";
		
		for(int i = 7; i >= 0; i--)
			if(decimal/Math.pow(2, i) == 1)
				binary += "1";
			else 
				binary += "0"; 
		
		System.out.println(binary);
	}
}

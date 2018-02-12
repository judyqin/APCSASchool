package Unit5;

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer
{
	private char theChar;

	public CharacterAnalyzer()
	{
		theChar = 'a';

	}

	public CharacterAnalyzer(char c)
	{

		setChar(c);
	}

	public void setChar(char c)
	{
		theChar = c; 

	}

	public char getChar()
	{
		return '-';
	}

	public boolean isUpper()
	{
		
		if(65 <= getASCII()) 
			if (getASCII() <= 90)
				return true; 


	return false;
	
	}

	public boolean isLower( )
	{

		if(97 <= getASCII()) 
			if (getASCII() <= 122)
				return true; 

		return false;
	}
	
	public boolean isNumber( )
	{
		if(48 <= getASCII()) 
			if (getASCII() <= 57)
				return true; 

		return false;
	}	

	
	public int getASCII( )
	{
		return (int)theChar; 
	}

	
	public String toString()
	{
 		
		//if(isLower())
			return ""+getChar() + " is a lowercase character. ASCII == " + getASCII() + "\n";	  
		
		//if(isLower())
			//return ""+getChar() + " is a lowercase character. ASCII == " + getASCII() + "\n";	
		
		//if(isLower())
			//return ""+getChar() + " is a lowercase character. ASCII == " + getASCII() + "\n";	
		
		
	}
}
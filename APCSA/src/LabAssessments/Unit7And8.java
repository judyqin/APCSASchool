package LabAssessments;

import java.util.Scanner; 

public class Unit7And8 {

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String guess, answer;
		String[] words = {"write", "that", "music", "happy"};
		
		do
		{
		
		Hangman test = new Hangman();
		String randword = test.randWord(words);
		System.out.println(randword);
		String asterick = test.Asterick(randword);
		System.out.println(asterick);
		test.replaceChar(randword, asterick);

		System.out.println("\n\nThe word is " + randword);
		System.out.println("You missed ____ time");
		
		System.out.println("\nDo you want to guess another word? y or n");
		answer = keyboard.nextLine();
		System.out.println("\n\n");
		
		} while (answer.equals("y"));
		
	}
	
}




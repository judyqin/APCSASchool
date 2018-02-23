package LabAssessments;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays; 

public class Hangman {
	 
	
	public static String randWord(String[] words)
	{
		
		Random rand = new Random(); 
	
		String randword = "";
		int randnumb; 
		
		randnumb = (int)(Math.random()*words.length);
		randword += words[randnumb]; 

		return randword; 
	}
	
	public static String Asterick(String word)
	{
		String asterick = word; 
		
		asterick = asterick.replaceAll("a", "*");
		asterick = asterick.replaceAll("b", "*");
		asterick = asterick.replaceAll("c", "*");
		asterick = asterick.replaceAll("d", "*");
		asterick = asterick.replaceAll("e", "*");
		asterick = asterick.replaceAll("f", "*");
		asterick = asterick.replaceAll("g", "*");
		asterick = asterick.replaceAll("h", "*");
		asterick = asterick.replaceAll("i", "*");
		asterick = asterick.replaceAll("j", "*");
		asterick = asterick.replaceAll("k", "*");
		asterick = asterick.replaceAll("l", "*");
		asterick = asterick.replaceAll("m", "*");
		asterick = asterick.replaceAll("n", "*");
		asterick = asterick.replaceAll("o", "*");
		asterick = asterick.replaceAll("p", "*");
		asterick = asterick.replaceAll("q", "*");
		asterick = asterick.replaceAll("r", "*");
		asterick = asterick.replaceAll("s", "*");
		asterick = asterick.replaceAll("t", "*");
		asterick = asterick.replaceAll("u", "*");
		asterick = asterick.replaceAll("v", "*");
		asterick = asterick.replaceAll("w", "*");
		asterick = asterick.replaceAll("x", "*");
		asterick = asterick.replaceAll("y", "*");
		asterick = asterick.replaceAll("z", "*");
		
		return asterick;
	}
	
	public void replaceChar(String word, String asterick)
	{
		String a = asterick; 
		String w = word; 
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Guess any letter in the alphabet: ");
		String guess = keyboard.nextLine();
		
		for (int i = 0; i < word.length(); i++)
			{
				if (guess.equals(word.charAt(i)));
				{
					a = a.replace("*", guess);
					i++;
					
				}
			}
		System.out.println(a);
	}
	

	

	
}

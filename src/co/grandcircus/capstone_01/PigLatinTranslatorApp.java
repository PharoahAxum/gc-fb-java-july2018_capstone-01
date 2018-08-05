package co.grandcircus.capstone_01;

import java.util.Scanner;

// Task: Capstone Week 1 - Translate from English to Pig Latin.

public class PigLatinTranslatorApp {
	
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		String userInput;
		String yeaNay;
		
		System.out.println("\tWelcome to the Pig Latin Translater!");
		
		do {
			System.out.println("\tEnter a line to be translated: ");
			userInput = scnr.nextLine();
			// format the string to ignore uppercase. (and later do one for special characters) 
			
			// go to methods:
				// go to method for words that start with a vowel.
				// go to method for words that start with a consonant.
			
			// test print
			System.out.println(userInput);
			
			// TODO add better validation. 
			System.out.println("\tDo you want to translate another line? (y/n)");
			yeaNay = scnr.nextLine();
		} while (yeaNay.equals("y"));
		
			System.out.println("\tGoodbye.");
		

		scnr.close();

		} 
	
	
	// Method for words that start with a vowel.
	public static String wordStartsWithVowel(String vowelFirst) {
		// Simple method that adds 'way' at the end of the original word.
		return vowelFirst + "way";
	}

	// Method for words that start with a consonant, hint via TA.)
	//public static int findFirstInt (String word) {
		//assume it takes in a word that starts with a consonant.
	//}
	
	// Method for x, hint via TA.))
	// public static String pigLatin (String word, ) {
		//substring splits a word at index int index, flips it around and does the Pig Latin translation.
	//}

}

// { a, e, i, o, u}
// "pig"'length()=3
// pig = igpay
// apple = appleway
// schlep = lepschway
// nymph = nymphway
// string scnrInput1;
// System.out.println("pig".charAt(0));
//
//	Single word example:
//	https://stackoverflow.com/questions/22420118/writing-a-java-program-that-converts-an-english-word-into-piglatin




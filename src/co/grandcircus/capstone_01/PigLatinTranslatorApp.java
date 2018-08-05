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
			
			// test print
			System.out.println(userInput);
			
			System.out.println("Do you want to translate another line? (y/n)");
			yeaNay = scnr.nextLine();
		} while (yeaNay.equals("y"));
		
		System.out.println("Goodbye.");
		

		scnr.close();

	}

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




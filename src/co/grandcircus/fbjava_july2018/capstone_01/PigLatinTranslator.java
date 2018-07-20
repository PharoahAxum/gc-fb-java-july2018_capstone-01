package co.grandcircus.fbjava_july2018.capstone_01;

import java.util.Scanner;

public class PigLatinTranslator {

	//{ a, e, i, o, u}
	//"pig"'length()=3
	//pig = igpay
	//apple = appleway
	//schlep = epschay
	//nymph = nymphway
	//string scnrInput1;
	//System.out.println("pig".charAt(0));
	
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		String userInput;
		
		System.out.println("\tWelcome to the Pig Latin Translater!");
		
		do {
			System.out.println("\tEnter a line to be translated: ");
			userInput = scnr.nextLine();
			
			System.out.println(userInput);
			
			System.out.println("Do you want to translate another line? (y/n)");
			userInput = scnr.nextLine();
		} while (userInput.equals("y"));
		
		System.out.println("Goodbye.");
		

		scnr.close();

	}

}

//	https://stackoverflow.com/questions/22420118/writing-a-java-program-that-converts-an-english-word-into-piglatin
//
//
//
//
//
//
//
//
//


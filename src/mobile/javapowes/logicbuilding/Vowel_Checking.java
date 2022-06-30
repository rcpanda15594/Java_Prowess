package mobile.javapowes.logicbuilding;

import java.util.Scanner;

public class Vowel_Checking {

	public static void main(String[] args)throws Exception {
		
		Scanner scn=new Scanner(System.in);
		
		
		System.out.println("Enter a Character::");
		
		char x=(char)System.in.read();
		
		
		if(x=='a' || x=='e' || x=='i' || x=='o'|| x=='u') {
			System.out.println("Character is Voiwel...");
		}
		else if(x=='A' || x=='E' || x=='I' || x=='O'|| x=='U'){
			System.out.println("Character is Voiwel...");
		
		}
		else {
			System.out.println("Character is not Voiwel...");
			
		   }//else
	
	}//main

	}//class



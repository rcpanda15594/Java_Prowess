package mobile.javapowes.logicbuilding;

import java.util.Scanner;

public class Greatest_No_Finding {

	public static void main(String[] args) {
	
		Scanner scn=new Scanner(System.in);
		while(true) {
		System.out.println("Enter Your 1st No::");
		int x=scn.nextInt();
		System.out.println("Enter Your 2nd No::");
		int y=scn.nextInt();
		
		if(x>y)
			System.out.println("Your 1st No is greatest...");
		else 
		   System.out.println("Your 2nd No is greatest...");
		}

	}

}

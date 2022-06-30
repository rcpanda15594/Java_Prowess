package mobile.javapowes.basic_program;

import java.util.Scanner;

public class Swaping_Test {

	public static void main(String[] args) {
	
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter 1st Value:");
		int a=scn.nextInt();
		System.out.println("Enter 2nd Value:");
		int b=scn.nextInt();
		
		System.out.println("Before Swaping:");
		System.out.println("first:"+a);
		System.out.println("second:"+b);
		
	int c=a;
	    a=b;
	    b=c;
	    System.out.println();
	
	System.out.println("first:"+a);
	System.out.println("sceond:"+b);
		
		
	}

}

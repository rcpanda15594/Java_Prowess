	package mobile.javapowess.number_series;

import java.util.Scanner;

public class Even_No_Series {
	public static void main(String[]args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Series No:");
		int n=scn.nextInt();
		System.out.println("Your Entry No is :"+n);
		System.out.println("Your Series is");
		for(int x=2;x<=n;x=x+2) {
			
			System.out.println(x+"");
		}
	}//main

}//class

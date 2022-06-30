package mobile.javapowess.number_series;

import java.util.Scanner;

public class Print_Series {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		while(true) {
		System.out.println("Enter Series Number N:");
		
		int n=scn.nextInt();
		
		for(int i=1;i<=n;i++) {
			//System.out.println("Series of that no is:"+i);
			
			System.out.println(i+"");
		}//for
		
		}
	}//main

}//class

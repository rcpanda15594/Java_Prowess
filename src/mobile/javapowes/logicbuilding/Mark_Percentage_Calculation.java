package mobile.javapowes.logicbuilding;

import java.util.Scanner;

public class Mark_Percentage_Calculation {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter Your Marks");
		System.out.print("Paper1 =");
		int p1=scn.nextInt();
		
		System.out.print("Paper2 =");
		int p2=scn.nextInt();
		
		System.out.print("Paper3 =");
		int p3=scn.nextInt();
		
		System.out.print("Paper4 =");
		int p4=scn.nextInt();
		
		System.out.print("Paper5 =");
		int p5=scn.nextInt();
		
		int x=p1+p2+p3+p4+p5;
		System.out.println("Total Marks:"+x);
		System.out.println("Persentage of Marks:"+x/0.100);
		
	}

}

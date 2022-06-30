/* 
 * Wap to find difference bet two numbers,diff must be Positive
 * 
 */

package mobile.javapowes.basic_program;

import java.util.Scanner;

public class Number_Diff_Test {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		
System.out.println("Enter First Number :");
int x=scn.nextInt();
System.out.println("Enter Second Number :");
int y=scn.nextInt();

        int diff=(x>y)?(x-y):(y-x);
        System.out.println(diff);


	}

}

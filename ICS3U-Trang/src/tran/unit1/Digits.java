package tran.unit1;

import java.util.Scanner;

/**
 * Asks the user to enter a number between 0 and 999. 
 * Date created: September 30, 2019
 *@author Trang Tran
 */
public class Digits {
	/**
	 * The start of the program 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int hundreds;
		int tens;
		int ones;
		
		//prompts the user
		System.out.println("Enter a three-digit number.");
		int number=sc.nextInt();
		
		//Outputs
		hundreds= number/100;
		System.out.println("Hundreds: " + hundreds);
		
		tens=(number-hundreds*100)/10;
		System.out.println("Tens: " + tens);
		
		ones=number-hundreds*100-tens*10;
		System.out.println("Ones: " + ones);
	}

}

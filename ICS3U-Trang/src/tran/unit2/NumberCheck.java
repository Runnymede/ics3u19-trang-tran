package tran.unit2;

import java.util.Scanner;

/**
 * Prompts the sure for an integer and checks if the integer is a negative number 
 * and if the divisible by 7
 * Date: October 2, 2019
 *@author Trang Tran
 */
public class NumberCheck {
	/**
	 * Start of the program
	 */
	public static void main(String[] args) {
		//new scanner
		Scanner sc=new Scanner(System.in);
		
		//variables
		int userInteger; //stores the integer that the user chose
		int divisibility;//stores the answer to the integer being divided by 7
		
		//prompts the user for an integer
		System.out.println("Please enter an integer");
		userInteger=sc.nextInt();
		
		divisibility=userInteger%7;
		
		//determines if the integer is positive or negative
		if (userInteger <0)
		{
			System.out.println("Your integer is negative");
		}
		else 
		{
			System.out.println("Your integer is positive");
		}
		
		//determines if the integer is divisible by 7
		if (divisibility==0)
		{
			System.out.println("Your number is divisible by 7!!");
		}
		else
		{
			System.out.println("Your number is not divisible by 7");
		}
	}

}

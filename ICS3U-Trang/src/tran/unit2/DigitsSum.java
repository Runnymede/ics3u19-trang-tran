package tran.unit2;

import java.util.Scanner;
/**
 * Prompts the user for a positive integer.<br>
 * Outputs the total sum of each digit in the integer.<br> 
 * Example: <br>
 * 		Enter positive integer: 321 <br>
 * 		The total is: 6<br>
 * Date: November 1, 2019
 *@author Trang Tran
 */
public class DigitsSum {
	/**
	 * Start of the program 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//variables
		int userNumber;//stores the number given by the user
		int total=0;//stores the sum of the numbers
		
		//prompts the user
		System.out.println("Enter a positive number:");
		userNumber=sc.nextInt();
		
		//keeps adding each digit in the integer and divides by 10 to get the next digit
		//every time it goes through the loop
		while(userNumber>0) {
			total=total+(userNumber%10);
			userNumber=userNumber/10;
		}
		System.out.println("The total of these numbers is "+total);

	}

}

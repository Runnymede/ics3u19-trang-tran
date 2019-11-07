package tran.unit2;
import java.util.Scanner;
/**
 * Prompts the user for a positive number. <br>
 * Displays every digit of the given number on a separate line. <br>  
 * Date: October 31, 2019
 *@author Trang Tran
 */
public class DigitsDisplay {
	/**
	 * Start of the program
	 * @param args
	 */
	public static void main(String[] args) {
		//new scanner called sc
		Scanner sc=new Scanner(System.in);
		
		//variables 
		int userNumber;//stores the given integer from the user  
		int mod=1000;
		int diff=100;
		int current=1;
		
		//tells the user about the program
		System.out.println("HI! I'll give you all the digits to the number you give me!");
		
		//prompts the user to enter an integer
		System.out.println("Enter a positive number:");
		userNumber=sc.nextInt();
		
		while(mod>1) 
		{
			current=userNumber%mod/diff;
			System.out.println(current);
			mod=mod/10;
			diff=diff/10;
		}
		
		//prints the last statement
		System.out.println("WOW!");



	}

}

package tran.unit2;
import java.util.Scanner;
/**
 * Prompts the user for a positive number. <br>
 * Displays every digit of the given number on a separate line. <br><p>  
 * Date: October 31, 2019
 *@author Trang Tran
 */
public class DigitsDisplay {
	/**
	 * Start of the program
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//variables 
		int userNumber;//stores the given integer from the user  
		int mod=1000;
		int diff=100;
		int current=1;
		
		//tells the user about the program
		System.out.println("HI! I'll give you all the digits to the 3-digit number you give me!");
		
		//prompts the user to enter an integer
		System.out.println("Enter a positive number:");
		userNumber=sc.nextInt();
		
		//displays each digit on a line
		while(mod>1) 
		{
			//displays a single digit
			current=userNumber%mod/diff;
			System.out.println(current);
			
			//prepares to display the next digit
			mod=mod/10;
			diff=diff/10;
		}
		
		//output
		System.out.println("WOW! Isn't that awesome??");



	}

}

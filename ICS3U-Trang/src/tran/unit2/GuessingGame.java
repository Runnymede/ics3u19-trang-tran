package tran.unit2;
import java.util.Scanner;

/**
 * Prompts the user to guess a number.<br>
 * Generates a random number for the user to guess.<br>
 * Compares the user's guess to the random number.<br><p>
 * Date: October 22, 2019
 *@author Trang Tran
 */
public class GuessingGame {
	/**
	 * Start of the program
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//variables
		int mySecretNumber;
		int userSecretNumber;
		
		//choosing the computer number to compare to
		mySecretNumber=(int)(Math.random()*20)+1;
		
		//prompts the user to guess the number 
		System.out.println("I'm thinking of a number, can you guess it?");
		System.out.println("I'll give you a hint. It's between 1 and 20");
		userSecretNumber=sc.nextInt();
		
		//compares both numbers and see if they equal each other
		if (mySecretNumber==userSecretNumber)
		{
			System.out.println("WOW! You guessed it!!");
		}
		else
		{
			System.out.println("HAHA! Wrong!");
		}
		
		//Displays the numbers
		System.out.println("My number was "+ mySecretNumber);
		System.out.println("Your number was "+ userSecretNumber);
		
	}

}

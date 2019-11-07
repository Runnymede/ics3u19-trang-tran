package tran.unit2;

import java.util.Scanner;

/**
 * Asks the user to guess a number.
 * If the user guesses it wrong, it keeps asking the user to guess the number until it's right.<br>
 * Date: October 28, 2019
 *@author Trang Tran
 */
public class GuessingGame2 {
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

		//prompt the user to guess the number 
		System.out.println("I'm thinking of a number, can you guess it?");
		System.out.println("I'll give you a hint. It's between 1 and 20");
		userSecretNumber=sc.nextInt();

		//compares both numbers and see if they equal each other
		while (mySecretNumber!=userSecretNumber)
		{
			System.out.println("HAHA! Wrong! Try again!");
			userSecretNumber=sc.nextInt();
		}
		
		System.out.println("WOW! You guessed it!!");


		//Displays the numbers
		System.out.println("My number was "+ mySecretNumber);
		System.out.println("Your number was "+ userSecretNumber);

	}

}

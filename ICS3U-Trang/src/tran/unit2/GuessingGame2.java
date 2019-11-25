package tran.unit2;

import java.util.Scanner;

/**
 * Asks the user to guess a number.<br>
 * If the user guesses it wrong, it keeps asking the user to guess the number until it's right.<br><p>
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

		//prompts the user to guess the number 
		System.out.println("I'm thinking of a number, can you guess it?");
		System.out.println("I'll give you a hint. It's between 1 and 20");
		userSecretNumber=sc.nextInt();

		//compares both numbers and see if they equal each other 
		//if the user guesses wrong, they can try again
		while (mySecretNumber!=userSecretNumber)
		{
			System.out.println("HAHA! Wrong! Try again!");
			userSecretNumber=sc.nextInt();
		}
		
		//Output if the user guessed correctly
		System.out.println("WOW! You guessed it!!");
		System.out.println("My number was "+ mySecretNumber);
		System.out.println("You guessed "+ userSecretNumber);

	}

}

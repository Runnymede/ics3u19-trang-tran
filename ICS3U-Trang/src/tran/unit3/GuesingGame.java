package tran.unit3;
import java.util.Scanner;

/**
 * This program asks the user to pick a color from a list of colors.<br>
 * The program then tries to guess what color the user picks.<br>
 * Each question has a different color.<br><p>
 * Date: November 25, 2019
 * @author Trang Tran
 */
public class GuesingGame {
	/**
	 * Start of the program
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);

		//variables
		String[] colour= {"Red","Orange","Yellow","Green","Blue","Indigo","Violet","Purple",
				"White","Black","Gray","Brown","Cyan","Maroon","Gold","Baby blue","Lilac",
				"Mahogany","Hot pink","Scarlet"};
		int randomIndex;
		String userAnswer;
		int guess=0;

		//Adlib 
		System.out.println("Hi! let's play a guessing game!\n"
				+ "Please pick a colour from below and wait for the game to start\n");
		System.out.println("Red, Orange, Yellow, Green,\n"
				+ "Blue, Indigo, Violet, Purple,\n"
				+ "Black, Grey, Brown, Cyan, \n"
				+ "Gold, Baby blue, Lilac, Mahogany,\n"
				+ "Hot pink, Scarlet, White, Maroon");
		
		//2 second delay before the game
		Thread.sleep(5000);
		System.out.println();

		//Generates a guess and asks the user
		randomIndex=(int)(Math.random()*20);
		System.out.println("Is it "+colour[randomIndex]+"?");
		userAnswer=sc.next();

		//rules the first answer out
		colour[randomIndex]="nothing";

		//Generates another guess until the user says "yes"
		//Gives up if everything has been tried
		while(userAnswer.equalsIgnoreCase("no"))
		{
			randomIndex=(int)(Math.random()*20);

			//picks another guess if it has asked that already
			while(colour[randomIndex].equals("nothing"))
			{
				randomIndex=(int)(Math.random()*20);
			}

			//asks the user to guess
			System.out.println("Is it "+colour[randomIndex]+"?");
			userAnswer=sc.next();

			//rules the guess (won't ask again)
			colour[randomIndex]="nothing";
			guess++;
			
			//print the "I give up" sequence when the computer has no more guesses
			if (guess==20)
			{
				System.out.println("I give up!");
			}
		}
		System.out.println("I guessed it!!");
		

	}

}

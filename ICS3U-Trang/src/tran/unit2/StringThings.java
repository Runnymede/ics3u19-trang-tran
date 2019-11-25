package tran.unit2;

import java.util.Scanner;

/**
 *This program is divided into 3 sub programs: <br>
 *1)Prompts the user to enter a word and displays what you can do with the word.<br>
 *2)Prompts the user to enter 2 words.<br>
 *3)Asks the user to enter a user name and password.<br><p>
 * Date: October 10, 2019
 * @author Trang Tran 
 */
public class StringThings {
	/**
	 * Start of the program
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//variables used in all 3 sub programs
		String longword;
		String word1;
		String word2;
		String username;
		String userpassword;
		
		//start of program 1
		//gets user input
		System.out.println("Please enter a 7-letter word:");
		longword=sc.next();
		
		//Does a lot of fancy things to the input
		System.out.println("You entered: "+ longword);
		System.out.println(longword.toUpperCase());
		System.out.println(longword.toLowerCase());
		System.out.println("It is " +longword.length()+ " letters long");
		System.out.println("The letter in 7th place is: " +longword.charAt(6));
		System.out.println("\n");
		
		//start of program 2
		//gets user input
		System.out.println("Enter a word:");
		word1=sc.next();
		System.out.println("Enter another word");
		word2=sc.next();
		
		//decides if the first letter of both words come before each other or 
		//if they're the same word
		if (word1.compareToIgnoreCase(word2)<0)
		{
			System.out.println("Hey! they're different words!");
			System.out.println(word1+" comes before "+word2);
		}
		else if (word1.compareToIgnoreCase(word2)>0)
		{
			System.out.println("Hey! they're different words!");
			System.out.println(word2+" comes before "+word1);
		}
		else
		{
			System.out.println("You entered the same word twice!!");
		}
		System.out.println("\n");
		
		//start of program 3
		//get user input
		System.out.println("Please enter your username: ");
		username=sc.next();
		System.out.println("Please enter your password: ");
		userpassword=sc.next();
		
		//checks if the username and password are correct 
		if (username.equalsIgnoreCase("BobbyMcmaster") && userpassword.equals("bobby12345689"))
		{
			System.out.println("Welcome " + username);
		}
		else
		{
			System.out.println("Incorrect username or password");
		}
		System.out.println("\n");
		
		
	}
}

package tran.unit2;

import java.util.Scanner;

/**
 * This program prompts the user for a string.<br>
 * It can consist of one word or a sentence.<br>
 * It then displays the number of vowels found in the word.<br><p>
 * Example:<br>
 * Please enter a word:<br>
 * Peanut butter Jelly time<br><p>
 * Output:<br>
 * There are 9 vowels.<p>
 * Date: November 12, 2019
 * @author Trang Tran
 */
public class CountVowels {
	/**
	 * Start of the program 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		//variables
		String userWord;
		int length;
		int vowelCounter=0;
		char letter;
		
		//Receives user input and counts the length
		System.out.println("Please enter a word and I'll count the vowels");
		userWord=sc.nextLine().toLowerCase();
		length=userWord.length();
		
		//checks for vowels in the word/sentence and counts them 
		for (int i=0;i<length;i++)
		{
			letter=userWord.charAt(i);
			
			switch (letter)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'y': vowelCounter++;
				break;
			default:
				break;
			}
		}
		
		//output
		System.out.println("The number of vowels in "+userWord+" is "+vowelCounter);
		

	}

}


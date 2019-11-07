package tran.unit2;

import java.util.Scanner;

/**
 * Prompts the user to enter a number.<br>
 * Then decides if the number is prime or not.<br><p>
 * Date: November 4, 2019
 * @author Trang Tran
 */
public class PrimeNumbers {
	/**
	 * Start of the program
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		//variables
		int modulus=1;
		int userNumber;
		int numberCounter=2;

		//asks for user input
		System.out.println("Give me a number and i'll tell you if it's prime or composite");
		userNumber=sc.nextInt();

		while(modulus!=0 && (numberCounter!=userNumber))
		{

			modulus=userNumber%numberCounter;
			numberCounter++;

		}

		if (modulus==0)
		{
			System.out.println("It is not prime! It's composite!");
		}
		else 
		{
			System.out.println("It's prime!!");
		}




	}

}

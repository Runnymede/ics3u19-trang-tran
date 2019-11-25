package tran.unit2;

import java.util.Scanner;

/**
 * This program asks the user for 2 numbers.<br>
 * The 2 numbers are added at the beginning and are the first numbers in the necklace sequence.<br>
 * The sum of the two numbers before is the next number in the necklace sequence
 * but only the number in the ones column.<br>
 * The sequence repeats until it reaches the same two original numbers.<br>
 * <p> Example:<br>
 * Enter two numbers:<br>
 * 1<br>
 * 8<br>
 * 
 * prints: 1, 8, 9, 7, 6, 3, 9, 2, 1, 3, 4, 7, 1, 8<br><p>
 * Date: November 6, 2019
 * @author Trang Tran
 */
public class Necklace {
	/**
	 * Start of the program
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		//variable assigning
		int num1;//store first original number
		int num2;//store second original number
		int sum;
		int newNum1;
		int newNum2;

		//asks the user to give two numbers
		System.out.println("Please enter a single digit number, but not 0 and negative");
		num1=sc.nextInt();
		System.out.println("Please enter another single digit number, but not 0 and negative");
		num2=sc.nextInt();

		//checks the number if it's zero
		if (num1==0 || num2==0)
		{
			System.out.println("One of your numbers are negative");
			System.out.println("Please re-enter a single digit number, but not 0 and negative");
			num1=sc.nextInt();
			System.out.println("Please re-enter another single digit number, but not 0 and negative");
			num2=sc.nextInt();
		}
		else if (num1!=0 || num2!=0)
		{
			//proceed sequence
		}
		
		//print both given numbers (begins the sequence)
		System.out.print(num1+", ");
		System.out.print(" "+num2+", ");

		/**
		 * Adds the 2 original numbers and continues the sequence with the third number<br>
		 * the third number is where the re-assigning variables start.
		 */
		sum=num1+num2;
		newNum2=num2;
		newNum1=sum%10;
		System.out.print(" "+newNum1+", ");

		/**
		 * Re-assigning variables newNum1 and newNum2 to continue the sequence<br>
		 * and stops until it returns to the original numbers.
		 */
		while(newNum1!=num2 || newNum2!=num1)
		{
			sum=(newNum1+newNum2)%10;
			newNum2=newNum1;
			newNum1=sum;
			System.out.print(" "+newNum1+", ");
		}
		System.out.println("Done!!");


	}

}

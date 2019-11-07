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

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
			int num1;
			int num2;
			int sum;
			int a;
			int b;
			
			System.out.println("Please enter a number that's not negative and not 0");
			num1=sc.nextInt();

			System.out.println("Please enter another number that's not negative and not 0");
			num2=sc.nextInt();
			
			System.out.print(num1+", ");
			System.out.print(" "+num2+", ");
			
			sum=num1+num2;
			b=num2;
			a=sum%10;
			System.out.print(" "+a+", ");
		
			while(a!=num2 || b!=num1)
			{
				sum=(a+b)%10;
				b=a;
				a=sum;
				System.out.print(" "+a+", ");
			}
			System.out.println("Done!!");
			

	}

}

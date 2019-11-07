package tran.unit2;
import java.util.Scanner;

/**
 * Prompts the user to enter a positive integer.<br>
 * Each digit would be cubed and then added together.<br>
 * The sum would be displayed to the user.<br>
 * Date: November 1, 2019
 *@author Trang Tran
 */
public class CubesSum {
		/**
		 * Start of the program
		 * @param args
		 */
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
			//variables
			int userNumber;//stores the user's number
			int cubedTotal=0;
			int modulus;
			
			//asks the user to enter an integer
			System.out.println("Please enter a positive integer");
			userNumber=sc.nextInt();
			
			//cubes each digit and adds this answer to the final total
			while(userNumber>0)
			{
				modulus=userNumber%10;
				cubedTotal+=Math.pow(modulus, 3);
				userNumber/=10;
			}
			
			//output that displays the sum
			System.out.println("The sum of the cubes of the digits is: "+cubedTotal);



	}

}

package tran.unit4;

import java.util.Scanner;
/**
 * Prompts the user for the size of the triangle (the number of rows used)<br>
 * Then, displays the triangle with stars.<br>
 * This triangle uses spaces to neatly formatted to actually look like a triangle.<p>
 * Example:<br>
 * Enter the size:<br>
 * 4<pre>
 *     *
 *    ***
 *   *****
 *  *******<p>
 * Date: December 17, 2019
 * @author Trang Tran
 */
public class IsoTriangles {
	/**
	 * Start of the program
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rowCounter;

		//Gets user Input 
		System.out.println("Enter the size:");
		int sizeOfTriangle=sc.nextInt();

		//calculates the initial value of the number of stars and spaces
		int spaceCalculator=sizeOfTriangle;
		int starValue=1;

		for (rowCounter=1;rowCounter<=sizeOfTriangle;rowCounter++) {
			drawSpaces(spaceCalculator);
			drawStars(starValue);
			System.out.println();
			spaceCalculator--;
			starValue+=2;
		}

	}

	/**
	 * Method "drawSpaces" decides how many spaces will be printed before the star
	 * @param amountOfSpaces
	 */
	public static void drawSpaces(int amountOfSpaces){
		for (int i=1;i<=(amountOfSpaces-1);i++)
		{
			System.out.print(" ");
		}
	}

	/**
	 * Method "drawStars" decides how many stars will be printed to the screen
	 * @param stars
	 */
	public static void drawStars(int stars) {
		for (int i=1;i<=stars;i++) {
			System.out.print("*");
		}
	}

}

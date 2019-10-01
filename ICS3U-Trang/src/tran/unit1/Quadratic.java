package tran.unit1;

import java.util.Scanner;
/**
 * Prompts the user for a,b,c (in a quadratic equation) and outputs the both answers 
 * Date: September 20, 2019
 *@author Trang Tran
 */
public class Quadratic {
	/**
	 * Start of the program
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		double a;
		double b;
		double c;
		
		System.out.println("Too lazy to calculate a, b, and c in a quadratic formula?");
		System.out.println("No worries! I'll do it for you!!");
		System.out.println("Enter a:");
		a=sc.nextDouble();
		
		System.out.println("Next, enter b:");
		b=sc.nextDouble();
		
		System.out.println("Lastly, enter c:");
		c=sc.nextDouble();
		
		double squareroot=Math.sqrt ((b*b)-(4*a*c));
		double value1=(-b+squareroot)/(2*a);
		double value2=(-b-squareroot)/(2*a);
		
		System.out.println("Here are your answers: ");
		System.out.println("Value 1 is: " +value1);
		System.out.println("Value 2 is: " + value2);
	}

}

package tran.unit2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Prompts the user for the number of prints they need.<br>
 * Displays the price per print and the total cost of the printing.<br><p>
 * Date: October 3, 2019
 * @author Trang Tran
 */
public class Printing {
	/**
	 * Start of the program
	 */
	public static void main(String[] args) {
		//new scanner
		Scanner sc=new Scanner(System.in);
		
		//Formatting the total cost
		DecimalFormat cost=new DecimalFormat("$0.00");
		
		//variables
		int numberofCopies;
		double pricePerCopy;
		double totalCost;
		
		//Checks the number of prints the user enters and saves the price
		System.out.println("Enter the number of copies to be printed: ");
		numberofCopies=sc.nextInt();
		
		if (numberofCopies>1000)
		{
			pricePerCopy=0.25;
		}
		else if (numberofCopies>=750)
		{
			pricePerCopy=0.26;
		}
		else if (numberofCopies>=500)
		{
			pricePerCopy=0.27;
		}
		else if (numberofCopies>=100)
		{
			pricePerCopy=0.28;
		}
		else
		{
			pricePerCopy=0.30;
		}
		
		//calculating the total cost of the printing
		totalCost=pricePerCopy*numberofCopies;
		
		//output 
		System.out.println("Price per copy is: "+ cost.format(pricePerCopy));
		System.out.println("Your total cost is: "+ cost.format(totalCost));
	}
}

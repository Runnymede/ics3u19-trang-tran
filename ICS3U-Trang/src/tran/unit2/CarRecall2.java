package tran.unit2;

import java.util.Scanner;

/**
 * Asks the user to enter a car model number. <br>
 * If the user entered a defective car model number, then it tells the user it's defective.<br>
 * It keeps asking the user to enter a car model number or to exit the program.<br>
 * Date: October 28, 2019
 *@author Trang Tran
 */
public class CarRecall2 {
	/**
	 * Start of the program
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		//variables
		int carModel;//stores the car model

		//prompts the user to enter car model or press 0
		System.out.println("Our auto company produced some models of cars that are defective.");
		System.out.println("Enter your car model number or press 0 to exit:");
		carModel=sc.nextInt();

		//checks if the car model is defective & repeats program OR checks if the user is exiting program
		while (carModel !=0)
		{
			switch (carModel) {
			case 199:
			case 179: 
			case 189: 
			case 190: 
			case 191: 
			case 192: 
			case 193: 
			case 194:
			case 195: 
			case 221: 
			case 780: System.out.println("Your car is defective. It must be repaired.");
			break;
			default: System.out.println("Your car is not defective.");
			break;
			}
			
			//repeats question 
			System.out.println("Enter your car model number or press 0 to exit:");
			carModel=sc.nextInt();
		}
		
		//output to state that the program is exiting
		System.out.println("Quitting program...");

	}

}

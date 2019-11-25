package tran.unit2;

import java.util.Scanner;
/**
 * Asks the use to enter their car model and checks if the user has a defected model.<br>
 * Automatically exits the user out of the program after the model has been entered
 * and message has been displayed.<br><p>
 * Date: October 4, 2019
 * @author Trang Tran
 */
public class CarRecall {
	/**
	 * Start of the program
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		//variables
		int carModel;//stores the car model

		//Gets user input
		System.out.println("Our auto company produced some models of cars that are defective.");
		System.out.println("To know if your car is defective, please enter your car model number:");
		carModel=sc.nextInt();
		
		//checks if the car model is defective or not
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
		
	}
}

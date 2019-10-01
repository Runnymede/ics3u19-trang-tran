package tran.unit1;

import java.util.Scanner;

/**
 * Finding the height of the object at a given time
 * Date created: September 23, 2019
 *@author Trang Tran
 */
public class ObjectHeight {
	/**
	 * The start of the program 
	 * @param args
	 */
	public static void main(String[]args) {
	
		Scanner sc=new Scanner(System.in);
		
		double time;
		double height;
		
		System.out.println("The height of an object at any given time dropped from a starting height of 100 meters is given by the equation: h = 100 - 2.9 * t^2");
		System.out.println("Enter a time less than 4.5 seconds: ");
		time=sc.nextDouble();
		
		height= 100-2.9*(time*time);
		
		System.out.println("The height of the object is: ");
		System.out.println(height+ " meters");
		
		
	
	}

}

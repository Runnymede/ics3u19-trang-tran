package tran.unit4;

import java.util.Scanner;

/**
 * This program has 4 different methods that uses arrays.<br>
 * Date: December 19, 2019
 * @author Trang Tran
 */
public class MathPlus {
	/**
	 * Start of the program
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int []originalArray= {99,1,5,99,103,1,103,9,107,1,13,107,111,2,111,10,115,1,115,5};
		
		System.out.println("Minimum Value: "+min(originalArray));
		System.out.println("Maximum Value: "+max(originalArray));
		System.out.println("Sum: "+sum(originalArray));
		System.out.println("Average: "+average(originalArray));
	}

	/**
	 * Method "min" receives an array and finds the index of the smallest value
	 * @param minArray receives an array
	 * @return The index of the smallest value
	 */
	
	//TODO: Figure out how to find the index 
	public static int min(int[]minArray) {
		int currentMin=minArray[0];
		
		for (int i=1;i<minArray.length;i++) {
			currentMin=Math.min(currentMin, minArray[i]);
		}
		return currentMin;
	}
	
	/**
	 * Method "max" receives an array and finds the index of the largest value
	 * @param maxArray receives an array
	 * @return The index of the largest value
	 */
	//TODO: Figure out how to find the index 
	public static int max(int[]maxArray) {
		int currentMax=maxArray[0];
		
		for (int i=1;i<maxArray.length;i++) {
			currentMax=Math.max(currentMax, maxArray[i]);
		}
		return currentMax;
	}
	
	/**
	 * Method "sum" receives an array and adds all the values 
	 * @param sumArray receives an array
	 * @return The sum of all the values 
	 */
	public static int sum(int[]sumArray) {
		int total=0;
		for (int i=0;i<sumArray.length;i++) {
			total+=sumArray[i];
		}
		return total;
	}
	
	/**
	 * Method "average" receives an array and gets the average all the values 
	 * @param averageArray receives an array
	 * @return The average of all the values 
	 */
	public static double average(int[]averageArray) {
		double total=0;
		for (int i=0;i<averageArray.length;i++) {
			total+=averageArray[i];
		}
		total/=averageArray.length;
		return total;
	}

}

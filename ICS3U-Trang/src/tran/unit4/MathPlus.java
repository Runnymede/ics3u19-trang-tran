package tran.unit4;

import java.util.Scanner;

/**
 * Testing of methods
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
		
		int []originalArray= {0,100,9,};
		
		System.out.println("Minimum Value: "+min(originalArray));
		System.out.println("Maximum Value: "+max(originalArray));
		System.out.println("Sum: "+sum(originalArray));
		System.out.println("Average: "+average(originalArray));
	}

	public static int min(int[]minArray) {
		int finalMin=0;
		int currentMin=minArray[0];
		
		for (int i=1;i<minArray.length;i++) {
			currentMin=Math.min(currentMin, i);
		}
		return currentMin;
	}
	
	public static int max(int[]maxArray) {
		int currentMax=maxArray[0];
		int finalMax=0;
		
		for (int i=1;i<maxArray.length;i++) {
			currentMax=Math.max(currentMax, i);
		}
		return currentMax;
	}
	
	public static int sum(int[]sumArray) {
		int total=0;
		for (int i=0;i<sumArray.length;i++) {
			total+=i;
		}
		return total;
	}
	
	public static double average(int[]averageArray) {
		double total=0;
		for (int i=0;i<averageArray.length;i++) {
			total+=i;
		}
		total/=averageArray.length;
		return total;
	}

}

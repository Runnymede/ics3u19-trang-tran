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

		int []array= {99,1,5,99,103,1,103,9,107,1,-13,107,111,2,111,10,115,1,115555,5};
		double[]array2= {2.45,3.90,4.15,5.23,6.56,1.36,7.93,8.35,9.75,10.0,1.36};

		System.out.println("Minimum Value: "+min(array));
		System.out.println("Maximum Value: "+max(array));
		System.out.println("Sum: "+sum(array));
		System.out.println("Average: "+average(array));
		
		System.out.println("\nMinimum Value: "+min(array2));
		System.out.println("Maximum Value: "+max(array2));
		System.out.println("Sum: "+sum(array2));
		System.out.println("Average: "+average(array2));
	}

	/**
	 * Method "min" receives an array and finds the index of the smallest value
	 * @param numbers receives an array
	 * @return The index of the smallest value
	 */
	public static int min(int[]numbers) {
		int currentMin=numbers[0];
		int index=0;
		for (int i=0;i<numbers.length;i++) {
			currentMin=Math.min(currentMin, numbers[i]);
		}
		for (int i=0;i<numbers.length;i++) {
			if (currentMin==numbers[i]) {
				index=i;
				break;
			}
		}
		return index;
	}

	/**
	 * Method "max" receives an array and finds the index of the largest value
	 * @param numbers receives an array
	 * @return The index of the largest value
	 */
	public static int max(int[]numbers) {
		int currentMax=numbers[0];
		int index=0;
		for (int i=0;i<numbers.length;i++) {
			currentMax=Math.max(currentMax, numbers[i]);
		}

		for (int i=0;i<numbers.length;i++) {
			if (currentMax==numbers[i]) {
				index=i;
				break;
			}
		}
		return index;
	}

	/**
	 * Method "sum" receives an array and adds all the values 
	 * @param numbers receives an array
	 * @return The sum of all the values 
	 */
	public static int sum(int[]numbers) {
		int total=0;
		for (int i=0;i<numbers.length;i++) {
			total+=numbers[i];
		}
		return total;
	}

	/**
	 * Method "average" receives an array and gets the average of all the values 
	 * @param numbers receives an array
	 * @return The average of all the values 
	 */
	public static double average(int[]numbers) {
		double total=sum(numbers);
		total/=numbers.length;
		return total;
	}
	
	/**
	 * 
	 * @param numbers
	 * @return
	 */
	public static int min(double [] numbers) {
		double currentMin=numbers[0];
		int index=0;
		for (int i=0;i<numbers.length;i++) {
			currentMin=Math.min(currentMin, numbers[i]);
		}
		for (int i=0;i<numbers.length;i++) {
			if (currentMin==numbers[i]) {
				index=i;
				break;
			}
		}
		return index;
	}

	/**
	 * 
	 * @param numbers
	 * @return
	 */
	public static int max(double [] numbers) {
		double currentMax=numbers[0];
		int index=0;
		for (int i=0;i<numbers.length;i++) {
			currentMax=Math.max(currentMax, numbers[i]);
		}

		for (int i=0;i<numbers.length;i++) {
			if (currentMax==numbers[i]) {
				index=i;
				break;
			}
		}
		return index;
	}
	
	/**
	 * 
	 * @param numbers
	 * @return
	 */
	public static double sum(double [] numbers) {
		int total=0;
		for (int i=0;i<numbers.length;i++) {
			total+=numbers[i];
		}
		return total;
	}
	/**
	 * 
	 * @param numbers
	 * @return
	 */
	public static double average(double [] numbers) {
		double total=sum(numbers);
		total/=numbers.length;
		return total;
	}
}
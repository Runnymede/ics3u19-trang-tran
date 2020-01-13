package tran.unit4;

import java.util.Arrays;
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
		double []array3= {2,8,5,9,1,3,7,6,4,0};
		int number=24;
		
		System.out.println("Minimum Index: "+min(array));
		System.out.println("Maximum Index: "+max(array));
		System.out.println("Sum: "+sum(array));
		System.out.println("Average: "+average(array));
	
		System.out.println("\nMinimum Index: "+min(array2));
		System.out.println("Maximum Index: "+max(array2));
		System.out.println("Sum: "+sum(array2));
		System.out.println("Average: "+average(array2));
		
		
		System.out.println("\nMedian: "+median(array3));
		System.out.println("Mode: "+mode(array3));
		System.out.println("Prime: "+prime(97));
		
		System.out.println("Factorial: "+factorial(6));
		System.out.println("numOfFactors: "+numOfFactors(number));
		System.out.print("Factors of "+number+": ");
		for (int i=0; i<factor(number).length;i++) {
			if (factor(24)[i]!=0) {
				System.out.print(factor(number)[i]+", ");
			}
		}
	
	}

	/**
	 * Method "min" receives an array and finds the index of 
	 * the first occurrence of the smallest value
	 * @param numbers - receives an array
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
	 * Method "max" receives an array and finds the index 
	 * of the first occurrence of the largest value
	 * @param numbers - receives an array
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
	 * Method "sum" adds all the values in the array and returns the total
	 * @param numbers - receives an array of all the integers that needs to be added
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
	 * Method "average" receives the total added int array
	 * and gets the average of the array
	 * @param numbers - receives the total of the int array
	 * @return The average of all the values 
	 */
	public static double average(int[]numbers) {
		double total=sum(numbers);
		total/=numbers.length;
		return total;
	}

	/**
	 * Method "min" receives an array and finds the index of the first 
	 * occurrence of the smallest number
	 * @param numbers - receives an array of all the doubles 
	 * @return returns the index of the smallest value
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
	 * Method "max" receives an array and finds the index of the first 
	 * occurrence of the largest number 
	 * @param numbers - receives an array of all the doubles 
	 * @return returns the index of the largest value
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
	 * Method "sum" adds all the doubles and returns the sum
	 * @param numbers - receives an array that has the needed doubles
	 * @return the sum of all the doubles
	 */
	public static double sum(double [] numbers) {
		int total=0;
		for (int i=0;i<numbers.length;i++) {
			total+=numbers[i];
		}
		return total;
	}
	/**
	 * Method "average" receives the total added double array
	 * and gets the average of the array
	 * @param numbers - receives the total of the array
	 * @return the average of the array
	 */
	public static double average(double [] numbers) {
		double total=sum(numbers);
		total/=numbers.length;
		return total;
	}
	
	/**
	 * Method "median" returns the median value from an array of doubles
	 * @param numbers - the array of doubles
	 * @return the median value from the array 
	 */
	public static double median(double []numbers) {
		Arrays.sort(numbers);
		double finalMedian=0;
		double medianA=Math.floor(numbers.length/2);
		
		if (numbers.length%2==0) {
			finalMedian=(numbers[(int) medianA]+numbers[(int)medianA-1])/2;
		}
		else {
			finalMedian=numbers[(int)Math.ceil(numbers.length/2)];
		}
		return finalMedian;
	}
	
	/**
	 * Method "mode" returns the most occurring value in the array
	 * @param numbers - the array of doubles 
	 * @return the mode (most occurring) value 
	 */
	public static double mode(double []numbers) {
		Arrays.sort(numbers);
		int currentCounter=0;//keep track of how many recurrences
		int modeCounter=0;
		double modeValue=0;
		
		for (int i=0;i<numbers.length;i++) {
			for(int a=0;a<numbers.length;a++) {
				if (numbers[i]==numbers[a]) {
					currentCounter++;
				}
				
				if (currentCounter>modeCounter) {
					modeCounter=currentCounter;
					modeValue=numbers[i];
				}
			}
		}
		
		return modeValue;
	}
	
	/**
	 * Method "prime" checks if a number is prime or not
	 * @param number - the number to be determined prime (or not)
	 * @return true if the number is prime, false otherwise
	 */
	public static boolean prime(int number) {
		int modulus=1;
		int numberCounter=2;
		
		while(modulus!=0 && (numberCounter!=number)){
			if (number==1||number==2) {
				modulus=0;
			}
			modulus=number%numberCounter;
			numberCounter++;
		}
		if (modulus!=0)
		{
			return true;//prime
		}
		return false;
	}
	
	/**
	 * Method "factorial" receives a number and determines the factorial 
	 * of the given number
	 * @param number - the value that determines the factorial
	 * @return the factorial of the given number
	 */
	public static long factorial(int number) {
		int product=1;
		
		while (number!=0) {
			product*=number;
			number-=1;
		}
		
		return product;
	}
	
	/**
	 * Method "numOfFactors" receives a number and 
	 * determines the number of factors of the given number
	 * @param number - the value to be factored
	 * @return the number of factors
	 */
	public static int numOfFactors(int number) {
		int factorCounter=0;
		for (int i=1;i<=number;i++) {
			if (number%i==0) {
				factorCounter++;
			}
		}
		return factorCounter;
	}
	
	/**
	 * Method "factor" receives a number and 
	 * determines all the factors of the given number
	 * @param numbers - the value to be factored
	 * @return all the factors 
	 */
	public static int [] factor(int numbers) {
		int factorIndex=0;
		int [] factorArray= new int [numbers];
	
		for (int i=1;i<=numbers;i++) {
			if (prime(numbers)==true) {
				factorArray[0]= 1;
				factorArray[1]=numbers;
			}
			if (numbers%i==0) {
				factorArray[factorIndex]=i;
				factorIndex++;
			}
		}
		
		return factorArray;
	}
}

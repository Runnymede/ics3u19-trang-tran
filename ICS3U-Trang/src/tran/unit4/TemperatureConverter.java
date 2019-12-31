package tran.unit4;

import java.util.Scanner;

/**
 * Prompts the user to enter a temperature in Fahrenheit 
 * and converts this temperature into Celsius (and vice versa)<p>
 * Example:<br>
 * Do you want temp are you converting to? Press the number you want.<br>
 * 1)FahrenheitToCelsius <br>
 * 2)CelsiusToFahrenheit<br>
 * input: 1<p>
 * Please enter the temperature in Farenheit: 23<br>
 * Output:-5<br>
 * 
 * <p>Date: December 18, 2019
 * @author Trang Tran
 */
public class TemperatureConverter {
	/**
	 * Start of the program
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double temp;
		
		//Decides which code to use for conversion by getting user input
		System.out.println("Do you want temp are you converting to? Press the number you want.");
		System.out.println("1)FahrenheitToCelsius \n2)CelsiusToFahrenheit");
		int answer=sc.nextInt();
		
		//Asks for the temperature and outputs the conversion
		if (answer==1)
		{
			System.out.println("Please enter the temperature in Farenheit:");
			temp=sc.nextInt();
			System.out.println("Your temperature in Celsius is "+FahrenheitToCelsius(temp));
		}
		else
		{
			System.out.println("Please enter the temperature in Celsius:");
			temp=sc.nextInt();
			System.out.println("Your temperature in Fahrenheit is "+CelsiusToFahrenheit(temp));
		}
		
	}
	
	/**
	 * Method "FahrenheitToCelsius" converts a temperature in Fahrenheit to Celsius
	 * @param fahTemp receives the user given temperature in Fahrenheit
	 * @return the temperature in Celsius
	 */
	public static double FahrenheitToCelsius(double fahTemp) {
		double tempFinal=(fahTemp - 32) * 5 / 9;
		return tempFinal;
	}
	
	/**
	 * Method "CelsiusToFahrenheit" converts a temperature in Celsius to Fahrenheit 
	 * @param celTemp receives the user given temperature in Celsius
	 * @return the temperature in Fahrenheit
	 */
	public static double CelsiusToFahrenheit(double celTemp) {
		double tempFinal=celTemp * 9 / 5 + 32;
		return tempFinal;
	}
	
}

package tran.unit4;

import java.util.Scanner;

/**
 * Prompts the user to enter a temperature in Fahrenheit 
 * and converts this temperature into Celsius (and vice versa)<br>
 * <p>
 * Date: December 18, 2019
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
		
		System.out.println("Do you want temp are you converting to? Press the number you want.");
		System.out.println("1)FahrenheitToCelsius \n2)CelsiusToFahrenheit");
		int answer=sc.nextInt();
		
		if (answer==1)
		{
			System.out.println("Please enter the temperature:");
			temp=sc.nextInt();
			System.out.println("Your temperature in Celsius is "+FahrenheitToCelsius(temp));
		}
		else
		{
			System.out.println("Please enter the temperature:");
			temp=sc.nextInt();
			System.out.println("Your temperature in Fahrenheit is "+CelsiusToFahrenheit(temp));
		}
		
	}
	
	/**
	 * 
	 * @param fahTemp
	 * @return
	 */
	public static double FahrenheitToCelsius(double fahTemp) {
		double tempFinal=(fahTemp - 32) * 5 / 9;
		return tempFinal;
	}
	
	/**
	 * 
	 * @param celTemp
	 * @return
	 */
	public static double CelsiusToFahrenheit(double celTemp) {
		double tempFinal=celTemp * 9 / 5 + 32;
		return tempFinal;
	}
	
}

package tran.unit2;

import java.util.Scanner;

/**
 * Determines if the packages from the user is suitable for delivery or not
 * Date: October 15, 2019
 *@author Trang Tran
 */
public class PackageCheck {
	/**
	 * Start of the program
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//variables used in program
		double packageWeight;
		double packageLength;
		double packageHeight;
		double packageWidth;
		double packageVolume;
		
		//prompts the user for package information
		System.out.println("Enter the package weight in kilograms: ");
		packageWeight=sc.nextDouble();
		System.out.println("Enter package length in centimeters: ");
		packageLength=sc.nextDouble();
		System.out.println("Enter package width in centimeters: ");
		packageHeight=sc.nextDouble();
		System.out.println("Enter package height in centimeters: ");
		packageWidth=sc.nextDouble();
		
		//Calculations used to determine the volume of the package
		packageVolume=packageLength*packageHeight*packageWidth;
		
		//Determines if the package can be delivered according to the dimensions
		if (packageWeight<=27 && packageVolume<=100000)
		{
			System.out.println("Accepted");
		}
		else if (packageWeight>27 && packageVolume<=100000)
		{
			System.out.println("Too heavy");
		}
		else if (packageWeight<=27 && packageVolume>100000)
		{
			System.out.println("Too large");
		}
		else
		{
			System.out.println("Too heavy and Too large");
		}
		
	}

}

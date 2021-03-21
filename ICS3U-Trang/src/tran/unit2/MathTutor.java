package tran.unit2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * This program generates two numbers and a random operation.<br>
 * It uses these to make an equation for the user.<br>
 * Prompts the user for the correct answer to the equation.<br><p>
 * Date: October 24, 2019
 *@author Trang Tran 
 */
public class MathTutor {
/**
 * Start of the program
 * @param args
 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//Rounding the answers to 2 decimal places
		DecimalFormat doubleDecimal = new DecimalFormat("#.##");
		
		//variables
		double userAnswer;
		double correctAnswer;
		double number1;
		double number2;
		int randomOperator;
		
		//AdLib
		System.out.println("Hi! I'm your online tutor!");
		System.out.println("I'm gonna give you a few questions and you answer them:");
		
		//generating 2 random numbers
		number1=(int)(Math.random()*10)+1;
		number2=(int)(Math.random()*10)+1;
				
		//generating a random number to decide the operator
		randomOperator=(int)(Math.random()*4)+1;
		
		//generates operator for the equation and prompts the user for the answer to the equation
		if (randomOperator==1)
		{
			System.out.println("What is "+ number1+" / "+number2);
			correctAnswer=number1/number2;
			userAnswer=sc.nextDouble();
		}
		else if (randomOperator==2)
		{
			System.out.println("What is "+number1+" + "+number2);
			correctAnswer=number1+number2;
			userAnswer=sc.nextDouble();
		}
		else if (randomOperator==3)
		{
			System.out.println("What is "+number1+" - "+number2);
			correctAnswer=number1-number2;
			userAnswer=sc.nextDouble();
		}
		else
		{
			System.out.println("What is "+number1+" x "+number2);
			correctAnswer=number1*number2;
			userAnswer=sc.nextDouble();
		}
		
		//determines if the user's answer is correct
		if (userAnswer==correctAnswer)
		{
			System.out.println("Right! It is "+ correctAnswer);
		}
		else 
		{
			System.out.println("Incorrect! The correct answer is "+ correctAnswer);
		}
		
	}

}

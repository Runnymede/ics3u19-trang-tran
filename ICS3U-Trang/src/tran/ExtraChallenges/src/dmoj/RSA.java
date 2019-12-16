package dmoj;

import java.util.Scanner;

/**
 * A number is an RSA number if it has exactly four divisors. 
 * In other words, there are exactly four numbers that divide 
 * into it evenly. For example, 10 is an RSA number because it
 * has exactly four divisors (1,2,5,10). 12 is not an RSA number
 * because it has too many divisors (1,2,3,4,6,12). 11 is not an
 * RSA number either. There is only one RSA number in the range 10…12.
 * @author trangtran
 *
 */
public class RSA {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int firstNumber=sc.nextInt();
		int secondNumber=sc.nextInt();
		int totalDivisors=0;
		int rsaNumber=0;
		
		for (int i=firstNumber;i<=secondNumber;i++)
		{
			for (int j=1;j<=12;j++)
			{
				if (i%j==0)
				{
					totalDivisors++;
				}
			}
			
			if (totalDivisors==4)
			{
				rsaNumber++;
			}
		}
		
		System.out.println("The number of RSA numbers between "+firstNumber+" and "+secondNumber+" is "+rsaNumber);

	}

}

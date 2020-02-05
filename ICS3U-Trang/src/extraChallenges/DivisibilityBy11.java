package extraChallenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DivisibilityBy11 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		 List<Integer> input = new ArrayList<>();
		 
		 int numbers=sc.nextInt();
		 for (int i=0;i<numbers;i++) {
			 input.add(sc.nextInt());
		 }
		 
		 for (int a=0;a<numbers;a++) {
			 int numberSecondary=input.get(a);
			 if (subtract(input.get(a), input)%11==0) {
				 System.out.println("The number "+ numberSecondary+" is divisible by 11.");
			 }
			 System.out.println();
		 }
	}

	public static int subtract(int number, List<Integer> input) {
		int sub;
		String number2;
		int length=Integer.toString(number).length();
		
		for (int i=2; i<=length;i++) {
			System.out.println(number);
			sub=number%10;
			number=number-sub;
			number/=10;
		}
		return number;
	}
	
}

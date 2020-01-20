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
			 divisibility(input.get(a));
		 }
	}

	public static int divisibility(int number) {
		int sub;
		String number2;
		
		int length=Integer.toString(number).length();
		for (int i=2; i<=length;i++) {
			number2=Integer.toString(number);
			
//			System.out.println(number);
//			sub=number%10;
//			number=number-sub;
		}
		
		return number;
	}
	
}

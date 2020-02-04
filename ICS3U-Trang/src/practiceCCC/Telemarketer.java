package practiceCCC;

import java.util.Scanner;

public class Telemarketer {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int [] numbers=new int [4];
		
		for (int i=0; i<4; i++) {
			numbers[i]=sc.nextInt();
		}

		if (check(numbers)==true)
			System.out.println("ignore");
		else
			System.out.println("answer");
	}

	public static boolean check (int[]numbers) {
		
		if (numbers[0]==9||numbers[0]==8) {
			if (numbers[3]==9||numbers[3]==8) {
				if (numbers[1]==numbers[2]) {
					return true;
				}
			}
		}
		return false;
	}
}

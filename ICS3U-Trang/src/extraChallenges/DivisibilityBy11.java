package extraChallenges;
import java.util.Scanner;

public class DivisibilityBy11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int numbers=sc.nextInt();
		divisibility(numbers);
		
		if (divisibility(numbers)==true) {
			System.out.println("The number "+numbers+" is divisible by 11.");
		}
		System.out.println("The number "+numbers+" is not divisible by 11.");
	}

	public static boolean divisibility(int numbers) {
		int last;
		int OG=numbers;
		int counter=0;

		//count how many digits are in the number
		while (numbers!=0) {
			numbers/=10;
			counter++;
		}

		for (int a=2;a<=counter;a++) {
			last=OG%10;
			OG-=last;
			System.out.println(OG);
		}
		
		if (OG%11==0) {
			return true;
		}
		return false;
	}

}

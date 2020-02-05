
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//Gets user input for the array
		int [] numbers=new int [4];//stores the last digits of the telephone
		for (int i=0; i<4; i++) {
			numbers[i]=sc.nextInt();
		}

		//calls check method and decides to ignore or answer the phone
		if (check(numbers)==true)
			System.out.println("ignore");
		else
			System.out.println("answer");
	}

	
	/**
	 * Checks if the last numbers of the telephone match the telemarketer criteria
	 * @param numbers - the array of the last digits
	 * @return true if it matches the telemarketer criteria
	 */
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

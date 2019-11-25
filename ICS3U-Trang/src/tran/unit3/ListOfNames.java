package tran.unit3;
import java.util.Scanner;

/**
 * This program prompts the user for a list of names.<br>
 * It ouputs the list of names in order and in reverse order.<br><p>
 * Date: November 23, 2019
 * @author Trang Tran
 */
public class ListOfNames {
	/**
	 * Start of the program
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//Getting the user input for how many numbers will be in the array
		System.out.println("Enter the number of names you have:");
		int n=sc.nextInt();
		String[] names=new String[n];
		
		//storing the names into the array
		System.out.println("Enter the "+n+" names one by one: ");
		for (int i=0;i<n;i++)
		{
			names[i]=sc.next();
		}
		
		//printing every name in order that is given
		System.out.println("\nHere is your list:");
		for (int i=0;i<n;i++) {
			System.out.println(names[i]);
		}
		
		//printing every name in reverse order
		System.out.println("\nHere is your list in reverse:");
		for (int i=(n-1);i>=0;i--) {
			System.out.println(names[i]);
		}

	}

}



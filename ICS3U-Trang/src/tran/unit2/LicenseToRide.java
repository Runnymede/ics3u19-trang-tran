package tran.unit2;
/**
 * This program calculates every possible combination with 4 numbers between 0-9.<br>
 * It adds each number in the combination to get a sum. <br>
 * It finds all the sums that add up to 34 or more.<br>
 * It then displays how many sums add up to 34 and more.<br><p>
 * Date: November 14, 2019
 * @author Trang Tran
 */
public class LicenseToRide {
	/**
	 * Start of the program
	 */
	public static void main(String[] args) {
		
		//variables
		int current;
		int over34=0;
		int sum=0;
		
		//Goes through every possible combination with the 4 numbers
		for (int num=0;num<=9999;num++)
		{
			current=num;
			
			//adds the individual digits in the combination
			while(current>0)
			{
				sum+=current%10;
				current/=10;
			}
			
			//counts how many sums are greater than or equal to 34
			if (sum>=34)
			{
				over34++;
			}
			
			//restarts the sum 
			sum=0;
		}
		
		//Output
		System.out.println("There are a total of " + over34 + " combinations that total over 34");
		
		
		
	}

}


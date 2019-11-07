package tran.unit2;
/**
 * Calculates the total amount of years for $2,500 of investment to be worth at least $5,000.<br>
 * Every year, the investment increases by 7.5%<br>
 * Date: October 29, 2019.
 *@author Trang Tran
 */
public class Investment {
	/**
	 * Start of the program
	 * @param args
	 */
	public static void main(String[] args) {

		//variables	
		double investment=2500;//stores the initial investment of $2500
		int year=0;//counter for amount of years
		double annualIncrease=0.075;//stores the annual increase
		
		//tells the user what the program is doing
		System.out.println("Hello, I've been asked to calculate how many years it takes to "
				+ "get your $2500 investment to $5000");
		
		//calculates investment while adding a year
		while (investment<5000) {
			year+=1;
			investment=(investment*annualIncrease)+investment;
		}
		
		//prints the total amount of years it takes
		System.out.println("It takes "+year+" years to reach $5000 investment");

	}

}

